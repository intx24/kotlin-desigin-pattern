package abstract_factory.sample.factory

import java.io.FileWriter
import java.io.IOException

abstract class Page(protected val title: String, protected val author: String) {
    protected val content = mutableListOf<Item>()
    
    fun add(item: Item) {
        content.add(item)
    }

    fun output() {
        try {
            val fileName = "$title.html"
            val writer = FileWriter(fileName)
            writer.write(makeHTML())
            writer.close()
            println(fileName + "を作成しました")
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }

    abstract fun makeHTML(): String
}