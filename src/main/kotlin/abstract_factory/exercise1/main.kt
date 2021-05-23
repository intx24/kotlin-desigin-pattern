package abstract_factory.exercise1

import abstract_factory.exercise1.factory.Factory

fun main(args: Array<String>) {
    val className = "ListFactory"

    val factory = Factory.getFactory(className)
    val linkOne = factory.createLink("link-1", "http://one.com")
    val linkTwo = factory.createLink("link-2", "http://two.com")

    val trayOne = factory.createTray("1-2")
    trayOne.add(linkOne)
    trayOne.add(linkTwo)

    val page = factory.createPage("page-1", "me")
    page.add(trayOne)
    page.output()
}