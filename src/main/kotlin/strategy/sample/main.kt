package strategy.sample

fun main(args: Array<String>) {
    val seed1 = 1
    val seed2 = 2

    val player1 = Player("Taro", WinningStrategy(seed1))
    val player2 = Player("Hana", ProbStrategy(seed2))

    for (i in 0..10000) {
        val nextHand1 = player1.nextHand()
        val nextHand2 = player2.nextHand()

        when {
            nextHand1.isStrongerThan(nextHand2) -> {
                println("Winner: player1")
                player1.win()
                player2.lose()
            }
            nextHand2.isStrongerThan(nextHand1) -> {
                println("Winner: player2")
                player1.lose()
                player2.win()
            }
            else -> {
                println("even")
            }
        }

        println("Total")
        println(player1.toString())
        println(player2.toString())
    }
}