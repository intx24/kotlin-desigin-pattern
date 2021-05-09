package adapter.sample.extends

class PrintBanner(private val string: String) : Banner(string), Print {
    override fun printWeak() {
        showWithParen()
    }

    override fun printStrong() {
        showWithAster()
    }
}