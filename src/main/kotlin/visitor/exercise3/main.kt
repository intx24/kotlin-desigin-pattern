package visitor.exercise3

fun main(args: Array<String>) {
    println("Making root entries...")
    val root1 = Directory("root1")
    root1.add(File("diary.html", 10))
    root1.add(File("index.html", 20))

    val root2 = Directory("root2")
    root2.add(File("diary.html", 1000))
    root2.add(File("index.html", 2000 ))

    val list = ElementArrayList()
    list.add(root1)
    list.add(root2)
    list.add(File("etc.html", 1234))

    list.accept(ListVisitor())
}
