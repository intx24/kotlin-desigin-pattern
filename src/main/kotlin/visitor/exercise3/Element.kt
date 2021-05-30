package visitor.exercise3

interface Element {
    abstract fun accept(v: Visitor)
}