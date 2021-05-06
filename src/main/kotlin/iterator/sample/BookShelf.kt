package iterator.sample

class BookShelf(maxsize: Int) : Aggregate {
    private val books: Array<Book?> = arrayOfNulls(maxsize)
    private var last: Int = 0

    fun getBookAt(index: Int): Book? {
        return books[index]
    }

    fun appendBook (book: Book) {
        books[last] = book
        last++
    }

    fun getLength(): Int {
        return last
    }

    override fun iterator(): Iterator {
        return BookShelfIterator(this)
    }
}