package template_method.example

class StringDisplay(private val string: String) : AbstractDisplay() {
    private val width: Int = string.length

    override fun open() {
        printLn()
    }

    override fun close() {
        printLn()
    }

    override fun print() {
        println("|${this.string}|")
    }

    fun printLn() {
        println("+${"-".repeat(width)}+")
    }
}