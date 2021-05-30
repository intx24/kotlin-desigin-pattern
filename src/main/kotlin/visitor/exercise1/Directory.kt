package visitor.exercise1

class Directory(private val name: String) : Entry() {
    private val entries = mutableListOf<Entry>()
    override fun getName(): String {
        return name
    }

    override fun getSize(): Int {
        return entries.size
    }

    override fun add(entry: Entry): Entry {
        entries.add(entry)
        return entry
    }

    override fun iterator(): Iterator<Entry> {
        return entries.iterator()
    }

    override fun accept(v: Visitor) {
        v.visit(this)
    }
}