package visitor.exercise2

class SizeVisitor : Visitor() {
    private var size: Int = 0

    fun getSize(): Int {
        return size
    }

    override fun visit(file: File) {
        size += 1
    }

    override fun visit(directory: Directory) {
        val iterator = directory.iterator()

        while (iterator.hasNext()) {
            iterator.next().accept(this)
        }
    }
}