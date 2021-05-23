package decorator.exercise1

class SideBorder(private val display: Display, private val ch: Char) : Border(display = display) {
    override fun getColumns(): Int {
        return 1 + display.getColumns() + 1
    }

    override fun getRows(): Int {
        return display.getRows()
    }

    override fun getRowText(row: Int): String {
        return ch + display.getRowText(row) + ch
    }
}