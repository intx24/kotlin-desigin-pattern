import composite.sample.Directory
import composite.sample.File

fun main(args: Array<String>) {
    val rootDir = Directory("root")
    val binDir = Directory("bin")
    val tmpDir = Directory("tmp")
    val usrDir = Directory("ur")
    rootDir.add(binDir)
    rootDir.add(tmpDir)
    rootDir.add(usrDir)
    binDir.add(File("vi", 10000))
    binDir.add(File("latext", 20000))
    rootDir.printList()
}
