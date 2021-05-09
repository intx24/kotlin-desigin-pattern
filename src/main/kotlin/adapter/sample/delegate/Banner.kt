package adapter.sample.delegate

open class Banner(private val string: String) {
    fun showWithParen() {
        println("(${this.string})")
    }

    fun showWithAster() {
        println("*${this.string}*")
    }
}