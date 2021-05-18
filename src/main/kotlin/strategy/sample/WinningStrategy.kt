package strategy.sample

import kotlin.random.Random

class WinningStrategy(private val seed: Int) : Strategy {
    private var won: Boolean = false
    private var previousHand: Hand? = null
    private val random: Random = Random(seed)

    override fun nextHand(): Hand {
        if (won && previousHand != null) {
            return previousHand as Hand
        }
        val newHand = Hand.getHand(HandType.getByValue(random.nextInt(3)))
        previousHand = newHand
        return newHand
    }

    override fun study(win: Boolean) {
        won = win
    }
}