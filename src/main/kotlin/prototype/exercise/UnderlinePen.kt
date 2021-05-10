package prototype.exercise

import prototype.exercise.framework.Product

class UnderlinePen(private val ulChar: Char) : Product() {
    override fun use(s: String) {
        val length: Int = s.length

        println("\"${s}\"")
        print(" ")
        for (i in 0 until length) {
            print(ulChar)
        }
        println(" ")
    }
}