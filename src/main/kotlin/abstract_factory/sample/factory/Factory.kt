package abstract_factory.sample.factory

abstract class Factory {
    companion object {
        fun getFactory(className: String): Factory {
            return Class.forName(className).kotlin as Factory
        }
    }
    abstract fun createLink(caption: String, url: String): Link
    abstract fun createTray(caption: String): Tray
    abstract fun createPage(title: String, author: String): Page
}