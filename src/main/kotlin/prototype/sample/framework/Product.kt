package prototype.sample.framework

abstract class Product : Cloneable {
    abstract fun use(s: String)
    abstract fun createClone(): Product
}