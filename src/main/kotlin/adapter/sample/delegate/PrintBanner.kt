package adapter.sample.delegate

class PrintBanner(private val string: String) :  Print {
    private val banner: Banner = Banner(string)

    override fun printWeak() {
        banner.showWithParen()
    }

    override fun printStrong() {
        banner.showWithAster()
    }
}