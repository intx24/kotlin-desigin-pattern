package visitor.exercise1

interface Element {
    abstract fun accept(v: Visitor)
}