package visitor.exercise1

class FileFindVisitor(private val extension: String) : Visitor() {
    private val foundFiles: MutableList<File> = mutableListOf()

    override fun visit(file: File) {
        if (file.getName().endsWith(extension)) {
            foundFiles.add(file)
        }
    }

    override fun visit(directory: Directory) {
        val iterator = directory.iterator()
        while (iterator.hasNext()) {
            iterator.next().accept(this)
        }
    }

    fun getFoundFiles(): List<File> {
        return foundFiles.toList()
    }
}