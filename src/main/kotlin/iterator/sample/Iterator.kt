package iterator.sample

interface Iterator {
    fun hasNext(): Boolean
    fun next(): Any?
}