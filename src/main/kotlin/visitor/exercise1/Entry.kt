package visitor.exercise1

abstract class Entry : Element {
    abstract fun getName(): String
    abstract fun getSize(): Int

    open fun add(entry: Entry): Entry {
        throw Exception()
    }

    open fun iterator(): Iterator<Entry> {
        throw Exception()
    }

    override fun toString(): String {
        return "${getName()}(${getSize()})"
    }
}