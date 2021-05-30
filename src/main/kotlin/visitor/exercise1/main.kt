package visitor.exercise1

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

    val yuki = Directory("yuki")
    val hanako = Directory("hanako")
    val tomura = Directory("tomura")
    usrDir.add(yuki)
    usrDir.add(hanako)
    usrDir.add(tomura)
    yuki.add(File("diary.html", 100))
    yuki.add(File("Composite.java", 200))
    hanako.add(File("memo.text", 300))
    hanako.add(File("index.html", 350))
    tomura.add(File("game.doc", 400))
    tomura.add(File("junk.mail", 500))

    val visitor = FileFindVisitor(".html")
    rootDir.accept(visitor)

    println("HTML files:")
    visitor.getFoundFiles().forEach { println(it.toString()) }

}
