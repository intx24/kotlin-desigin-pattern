package builder.exercise2

class TextBuilder : Builder() {
    private val buffer = StringBuilder()

    override fun buildTitle(title: String) {
        buffer.append("======================\n")
        buffer.append("「${title}」\n")
        buffer.append("\n")
    }

    override fun buildString(str: String) {
        buffer.append("■${str}")
        buffer.append("\n")
    }

    override fun buildItems(items: Array<String>) {
        for (i in items) {
            buffer.append(i)
        }
        buffer.append("\n")
    }

    override fun buildClose() {
        buffer.append("======================\n")
    }

    fun getResult(): String {
        return buffer.toString()
    }
}