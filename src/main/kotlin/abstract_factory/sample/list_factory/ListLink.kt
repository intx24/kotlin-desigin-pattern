package abstract_factory.sample.list_factory

import abstract_factory.sample.factory.Link

class ListLink(caption: String, url: String) : Link(caption, url) {
    override fun makeHTML(): String {
        return "<li><a href=$url>$caption</a></li>"
    }
}