package strategy.sample

import kotlin.random.Random

class ProbStrategy(private val seed: Int) : Strategy {
    private val random: Random = kotlin.random.Random(seed)
    private var previousHand: Hand = Hand.getHand(HandType.GUU)
    private var currentHand: Hand = Hand.getHand(HandType.GUU)
    private val history: MutableMap<HandType, MutableList<Int>> = mutableMapOf(
        HandType.GUU to mutableListOf(1, 1, 1),
        HandType.CHO to mutableListOf(1, 1, 1),
        HandType.PAA to mutableListOf(1, 1, 1)
    )

    private fun getSum (handType: HandType): Int {
        return history[handType]!!.sum()
    }

    override fun nextHand(): Hand {
        val currentHandType = currentHand.handType
        val bet = random.nextInt(getSum(currentHandType))

        var handType: HandType
        val selectedHistory = history[currentHandType]!!
        if (bet < selectedHistory[0]) {
            handType = HandType.GUU
        } else if (bet < selectedHistory[0] + selectedHistory[1]) {
            handType = HandType.CHO
        } else {
            handType = HandType.PAA
        }

        previousHand = Hand.getHand(currentHandType)
        currentHand = Hand(handType)
        return Hand(handType)
    }

    override fun study(win: Boolean) {
        if (win) {
            history[previousHand.handType]!![currentHand.handType.handValue]++
        } else {
            history[previousHand.handType]!![(currentHand.handType.handValue + 1) % 3]++
            history[previousHand.handType]!![(currentHand.handType.handValue + 2) % 3]++
        }
    }
}