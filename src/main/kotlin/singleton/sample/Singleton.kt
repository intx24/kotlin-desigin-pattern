package singleton.sample

class Singleton private constructor() {
    companion object {
        private val singleton = Singleton()
        fun getInstance(): Singleton {
            return singleton
        }
    }

    init {
        println("generated instance")
    }


}