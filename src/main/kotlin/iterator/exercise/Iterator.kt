package iterator.exercise

interface Iterator {
    fun hasNext(): Boolean
    fun next(): Any?
}