package template_method.sample

abstract class AbstractDisplay {
    abstract fun open()
    abstract fun close()
    abstract fun print()
    fun display() {
        this.open()

        for (i in 1..5) print()

        this.close()
    }
}