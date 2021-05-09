package adapter.sample.delegate

fun main(args: Array<String>) {
    val p: Print = PrintBanner("str")
    p.printWeak()
    p.printStrong()
}