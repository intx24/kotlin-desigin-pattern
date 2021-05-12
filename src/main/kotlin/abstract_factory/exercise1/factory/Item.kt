package abstract_factory.exercise1.factory

abstract class Item(protected val caption: String) {
    abstract fun makeHTML(): String
}