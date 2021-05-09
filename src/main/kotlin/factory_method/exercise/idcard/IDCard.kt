import factory_method.exercise.framework.Product

class IDCard (private val owner: String, private val no: Int) : Product() {
    init {
        println("${owner}, ${no}のカードを作ります")
    }

    override fun use() {
        println("${owner}, ${no}のカードを使用します")
    }

    fun getOwner(): String {
        return owner
    }

    fun getNo(): Int {
        return no
    }
}