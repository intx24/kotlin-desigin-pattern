package abstract_factory.exercise1.list_factory

import abstract_factory.exercise1.factory.Factory
import abstract_factory.exercise1.factory.Link
import abstract_factory.exercise1.factory.Page
import abstract_factory.exercise1.factory.Tray


class ListFactory : Factory() {
    override fun createLink(caption: String, url: String): Link {
        return ListLink(caption, url)
    }

    override fun createTray(caption: String): Tray {
        return ListTray(caption)
    }

    override fun createPage(title: String, author: String): Page {
        return ListPage(title, author)
    }
}