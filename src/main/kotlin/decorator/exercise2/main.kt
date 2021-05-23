package decorator.exercise2

fun main(args: Array<String>) {
    val md = MultiStringDisplay()
    md.add("おはようございます")
    md.add("こんにちは")
    md.add("おやすみなさい、また明日")
    md.show()

    val d1 = SideBorder(md, '#')
    d1.show()

    val d2 = FullBorder(md)
    d2.show()
}
