package iterator.exercise

fun main(args: Array<String>) {
    val bookShelf = BookShelf()

    bookShelf.appendBook(Book("book1"))
    bookShelf.appendBook(Book("book2"))
    bookShelf.appendBook(Book("book3"))
    bookShelf.appendBook(Book("book4"))
    bookShelf.appendBook(Book("book5"))
    bookShelf.appendBook(Book("book6"))
    bookShelf.appendBook(Book("book7"))

    val iterator = bookShelf.iterator()

    while (iterator.hasNext()) {
        val book = iterator.next() as Book
        println(book.name)
    }
}