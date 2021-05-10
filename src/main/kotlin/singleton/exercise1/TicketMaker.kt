package singleton.exercise1

class TicketMaker private constructor(){
    private var ticket: Int = 1000

    companion object {
        private val instance: TicketMaker = TicketMaker()
        fun getInstance(): TicketMaker {
            return instance
        }
    }

    @Synchronized
    fun getNextTicketNumber(): Int {
        return ticket++
    }
}