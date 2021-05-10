package prototype.exercise

import prototype.exercise.framework.Product

class MessageBox(private val decoChar: Char) : Product() {
    override fun use(s: String) {
        val length: Int = s.length

        for (i in 0 until length + 4) {
            print(decoChar)
        }
        println()
        println("$decoChar $s $decoChar")
        for (i in 0 until length + 4) {
            print(decoChar)
        }
        println()
    }
}