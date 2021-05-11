package builder.sample

class TextBuilder : Builder() {
    private val buffer = StringBuilder()

    override fun makeTitle(title: String) {
        buffer.append("======================\n")
        buffer.append("「${title}」\n")
        buffer.append("\n")
    }

    override fun makeString(str: String) {
        buffer.append("■${str}")
        buffer.append("\n")
    }

    override fun makeItems(items: Array<String>) {
        for (i in items) {
            buffer.append(i)
        }
        buffer.append("\n")
    }

    override fun close() {
        buffer.append("======================\n")
    }

    fun getResult(): String {
        return buffer.toString()
    }
}