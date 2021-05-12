package abstract_factory.exercise1.list_factory

import abstract_factory.exercise1.factory.Tray


class ListTray(caption: String) : Tray(caption) {
    override fun makeHTML(): String {
        val itemHTML = tray.joinToString { it.makeHTML() + "\n" }
        return "<li><ul>$itemHTML</ul></li>"
    }
}