package decorator.exercise2

class MultiStringDisplay() : Display() {
    private val strings: MutableList<String> = mutableListOf()

    override fun getColumns(): Int {
        return strings.maxOf { it.length }
    }

    override fun getRows(): Int {
        return strings.size
    }

    override fun getRowText(row: Int): String {
        return strings[row].padEnd(strings.maxOf { it.length }, ' ')
    }

    fun add(string: String) {
        strings.add(string)
    }
}