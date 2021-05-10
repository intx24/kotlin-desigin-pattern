package prototype.exercise.framework

abstract class Product : Cloneable {
    abstract fun use(s: String)
    fun createClone(): Product {
        return clone() as Product
    }
}