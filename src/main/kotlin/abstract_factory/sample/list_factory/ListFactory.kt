package abstract_factory.sample.list_factory

import abstract_factory.sample.factory.Factory
import abstract_factory.sample.factory.Link
import abstract_factory.sample.factory.Page
import abstract_factory.sample.factory.Tray

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