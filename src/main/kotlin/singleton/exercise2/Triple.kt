package singleton.exercise2

class Triple private constructor(private val id: Int) {
    companion object {
        private val instances: List<Triple> = listOf(
            Triple(0),
            Triple(1),
            Triple(2)
        )
        fun getInstance(id: Int): Triple {
            return instances.find { it.id == id } ?: throw Exception("exceeds instance max id")
        }
    }

    override fun toString(): String {
        return "Triple Id: ${this.id}"
    }
}