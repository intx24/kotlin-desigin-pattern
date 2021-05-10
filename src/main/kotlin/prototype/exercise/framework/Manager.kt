package prototype.exercise.framework

import java.util.NoSuchElementException

class Manager {
    private val showCase: MutableMap<String, Product> = mutableMapOf()

    fun register(name: String, proto: Product) {
        showCase[name] = proto
    }

    fun create(protoName: String): Product {
        return showCase[protoName]?.createClone() ?: throw NoSuchElementException()
    }
}