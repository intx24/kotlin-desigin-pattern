package builder.exercise2

abstract class Builder {
    private var addedTitle: Boolean = false
    fun makeTitle(title: String) {
        if (addedTitle) return
        buildTitle(title)
        addedTitle = true
    }
    fun makeString(str: String) {
        if (!addedTitle) return
        buildString(str)
    }
    fun makeItems(items: Array<String>) {
        if (!addedTitle) return
        buildItems(items)
    }
    fun close() {
        if (!addedTitle) return
        buildClose()
    }

    abstract fun buildTitle(title: String)
    abstract fun buildString(str: String)
    abstract fun buildItems(items: Array<String>)
    abstract fun buildClose()
}