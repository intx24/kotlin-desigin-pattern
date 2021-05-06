package iterator.sample

fun main(args: Array<String>) {
    val bookShelf = BookShelf(4)

    bookShelf.appendBook(Book("book1"))
    bookShelf.appendBook(Book("book2"))
    bookShelf.appendBook(Book("book3"))

    val iterator = bookShelf.iterator()

    while (iterator.hasNext()) {
        val book = iterator.next() as Book
        println(book.name)
    }
}