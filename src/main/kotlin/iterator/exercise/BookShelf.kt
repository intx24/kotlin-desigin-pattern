package iterator.exercise

class BookShelf() : Aggregate {
    private val books: MutableList<Book?> = mutableListOf()

    fun getBookAt(index: Int): Book? {
        return books[index]
    }

    fun appendBook (book: Book) {
        books.add(book)
    }

    fun getLength(): Int {
        return books.size
    }

    override fun iterator(): Iterator {
        return BookShelfIterator(this)
    }
}