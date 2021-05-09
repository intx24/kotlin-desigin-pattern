package template_method.example

import java.io.InputStream

class CharDisplay(private val char: Char) : AbstractDisplay() {
    override fun open() {
        print("<<")
    }

    override fun close() {
        println(">>")
    }

    override fun print() {
        print(this.char)
    }
}