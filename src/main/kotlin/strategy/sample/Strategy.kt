package strategy.sample

interface Strategy {
    fun nextHand(): Hand
    fun study(win: Boolean)
}