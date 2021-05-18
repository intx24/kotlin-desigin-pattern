package strategy.sample

class Hand(val handType: HandType) {
    companion object {
        val hands: List<Hand> = listOf(
            Hand(HandType.GUU),
            Hand(HandType.CHO),
            Hand(HandType.PAA),
        )
        fun getHand(handType: HandType): Hand {
            return hands.find { it.handType == handType }
                ?: throw NoSuchElementException("hand")
        }
    }

    fun isStrongerThan(hand: Hand): Boolean {
        return this.handType.fight(hand.handType) == FightResult.WIN
    }

    fun isWeakerThan(hand: Hand): Boolean {
        return this.handType.fight(hand.handType) == FightResult.LOSE
    }

    private fun fight(hand: Hand): FightResult {
        return this.handType.fight(hand.handType)
    }

    override fun toString(): String {
        return this.handType.handName
    }
}