package adapter.sample.exercise

import java.io.FileInputStream
import java.io.FileOutputStream
import java.nio.file.Path
import java.nio.file.Paths
import java.util.*

class FileProperties : FileIO {
    private val properties: Properties = Properties()

    override fun readFromFile(fileName: String) {
        this.properties.load(FileInputStream("src/main/kotlin/adapter/sample/exercise/${fileName}"))
    }

    override fun writeToFile(fileName: String) {
        this.properties.store(FileOutputStream("src/main/kotlin/adapter/sample/exercise/${fileName}"), "written by FileProperties")
    }

    override fun setValue(key: String, value: String) {
        this.properties.setProperty(key, value)
    }

    override fun getValue(key: String): String {
        return this.properties.getProperty(key)
    }
}