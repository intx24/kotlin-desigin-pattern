package abstract_factory.exercise1.list_factory

import abstract_factory.exercise1.factory.Link

class ListLink(caption: String, url: String) : Link(caption, url) {
    override fun makeHTML(): String {
        return "<li><a href=$url>$caption</a></li>"
    }
}