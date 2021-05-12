package abstract_factory.sample.list_factory

import abstract_factory.sample.factory.Page

class ListPage(title: String, author: String) : Page(title, author) {
    override fun makeHTML(): String {
        return "<html><head><title>$title</title></head>\n" +
                "<body>\n" +
                "<h1>$title</h1>\n" +
                "<ul>\n" +
                content.joinToString { it.makeHTML() + "\n" } +
                "</ul>" +
                "<hr><address>$author</address>" +
                "</body></html>"
    }
}