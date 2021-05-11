package builder.exercise1

interface Builder {
    fun makeTitle(title: String)
    fun makeString(str: String)
    fun makeItems(items: Array<String>)
    fun close()
}