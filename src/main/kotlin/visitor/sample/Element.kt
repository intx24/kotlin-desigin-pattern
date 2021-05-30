package visitor.sample

interface Element {
    abstract fun accept(v: Visitor)
}