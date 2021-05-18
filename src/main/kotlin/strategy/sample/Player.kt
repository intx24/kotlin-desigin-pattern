package strategy.sample

class Player(private val name: String, private val strategy: Strategy) {
    private var winCount: Int = 0
    private var loseCount: Int = 0
    private var gameCount: Int = 0

    fun nextHand(): Hand {
        return strategy.nextHand()
    }

    fun win() {
        strategy.study(true)
        winCount++
        gameCount++
    }

    fun lose() {
        strategy.study(false)
        loseCount++
        gameCount++
    }

    fun draw() {
        gameCount++
    }

    override fun toString(): String {
        return "name: $name, gamecount: $gameCount, win: $winCount, lose: $loseCount"
    }
}