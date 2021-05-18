package strategy.exercise1

import kotlin.random.Random

class RandomStrategy(private val seed: Int) : Strategy {
    private var won: Boolean = false
    private val random: Random = kotlin.random.Random(seed)

    override fun nextHand(): Hand {
        return Hand(HandType.getByValue(random.nextInt(3)))
    }

    override fun study(win: Boolean) {
        won = win
    }
}