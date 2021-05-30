package visitor.exercise2

class ListVisitor : Visitor() {
    private var currentDir: String = ""
    override fun visit(file: File) {
        println("$currentDir/${file}")
    }

    override fun visit(directory: Directory) {
        println("$currentDir/${directory}")
        val iterator = directory.iterator()
        while (iterator.hasNext()) {
            iterator.next().accept(this)
        }
        currentDir = "$currentDir/${directory.getName()}"
    }
}