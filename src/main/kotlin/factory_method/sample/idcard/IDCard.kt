package factory_method.sample.idcard

import factory_method.sample.framework.Product

class IDCard (private val owner: String) : Product() {
    init {
        println("${owner}のカードを作ります")
    }

    override fun use() {
        println("${owner}のカードを使用します")
    }

    fun getOwner(): String {
        return owner
    }
}