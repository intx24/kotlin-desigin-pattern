import visitor.sample.Directory
import visitor.sample.File
import visitor.sample.ListVisitor

fun main(args: Array<String>) {
    println("Making root entries...")
    val rootDir = Directory("root")
    val binDir = Directory("bin")
    val tmpDir = Directory("tmp")
    val usrDir = Directory("usr")
    rootDir.add(binDir)
    rootDir.add(tmpDir)
    rootDir.add(usrDir)
    binDir.add(File("vi", 10000))
    binDir.add(File("latext", 20000))
    rootDir.accept(ListVisitor())
}
