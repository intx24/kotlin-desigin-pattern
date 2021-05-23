package decorator.exercise1

class UpDownBorder(private val display: Display, private val ch: Char) : Border(display = display) {
    override fun getColumns(): Int {
        return display.getColumns()
    }

    override fun getRows(): Int {
        return 1 + display.getRows() + 1
    }

    override fun getRowText(row: Int): String {
        return when(row) {
            0 -> makeLine(ch, display.getColumns())
            display.getRows() + 1 -> makeLine(ch, display.getColumns())
            else -> return display.getRowText(row - 1)
        }
    }

    private fun makeLine(ch: Char, count: Int): String {
        return ch.toString().repeat(count)
    }
}