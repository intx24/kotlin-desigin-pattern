package composite.sample

class Directory(private val name: String) : Entry() {
    private val directory: MutableList<Entry> = mutableListOf()
    override fun getName(): String {
        return name
    }

    override fun getSize(): Int {
        return directory.size
    }

    override fun printList(prefix: String) {
        println("$prefix/$this")
        directory.forEach { it.printList("$prefix/$name") }
    }

    override fun add(entry: Entry): Entry {
        this.directory.add(entry)
        return entry
    }
}