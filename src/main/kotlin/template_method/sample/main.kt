package template_method.sample

fun main(args: Array<String>) {
    val d1: AbstractDisplay = CharDisplay('C')
    val d2: AbstractDisplay = StringDisplay("D2")
    val d3: AbstractDisplay = StringDisplay("D3")

    d1.display()
    d2.display()
    d3.display()
}