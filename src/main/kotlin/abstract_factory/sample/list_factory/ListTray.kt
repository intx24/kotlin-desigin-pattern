package abstract_factory.sample.list_factory

import abstract_factory.sample.factory.Tray

class ListTray(caption: String) : Tray(caption) {
    override fun makeHTML(): String {
        val itemHTML = tray.joinToString { it.makeHTML() + "\n" }
        return "<li><ul>$itemHTML</ul></li>"
    }
}