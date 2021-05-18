package strategy.exercise1

interface Strategy {
    fun nextHand(): Hand
    fun study(win: Boolean)
}