package strategy.exercise1

enum class HandType(val handValue: Int, val handName: String) {
    GUU(0, "グー") {
        override fun fight(enemyHand: HandType): FightResult {
            return when(enemyHand) {
                GUU -> FightResult.DRAW
                CHO -> FightResult.WIN
                PAA -> FightResult.LOSE
            }
        }
    },
    CHO(1, "チョキ") {
        override fun fight(enemyHand: HandType): FightResult {
            return when(enemyHand) {
                GUU -> FightResult.LOSE
                CHO -> FightResult.DRAW
                PAA -> FightResult.WIN
            }
        }
    },
    PAA(2, "パー")  {
        override fun fight(enemyHand: HandType): FightResult {
            return when(enemyHand) {
                GUU -> FightResult.WIN
                CHO -> FightResult.LOSE
                PAA -> FightResult.DRAW
            }
        }
    };

    companion object {
        fun getByValue(value: Int): HandType {
            return values().find { it.handValue == value } ?: throw NoSuchElementException("handType")
        }
    }

    abstract fun fight(enemyHand: HandType): FightResult
}