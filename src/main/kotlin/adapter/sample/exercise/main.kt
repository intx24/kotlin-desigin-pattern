package adapter.sample.exercise

fun main(args: Array<String>) {
    val f: FileIO = FileProperties()
    f.readFromFile("file.txt")
    f.setValue("year", "2004")
    f.setValue("month", "4")
    f.setValue("day", "21 ")
    f.writeToFile("newFile.txt")
}