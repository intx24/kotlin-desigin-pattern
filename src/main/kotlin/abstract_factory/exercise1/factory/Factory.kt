package abstract_factory.exercise1.factory

abstract class Factory {
    companion object {
        fun getFactory(className: String): Factory {
            return Class.forName(className).kotlin as Factory
        }
    }
    abstract fun createLink(caption: String, url: String): Link
    abstract fun createTray(caption: String): Tray
    abstract fun createPage(title: String, author: String): Page

    fun createYahooPage(): Page {
        val link = createLink("Yahoo!", "http://yahoo.com")
        val page = createPage("Yahoo!", "Yahoo!")
        page.add(link)
        return page
    }
}