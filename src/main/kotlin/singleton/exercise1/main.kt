package singleton.exercise1

import factory_method.sample.framework.Factory
import factory_method.sample.framework.Product
import factory_method.sample.idcard.IDCardFactory

fun main(args: Array<String>) {
    println("Start.")
    val maker: TicketMaker = TicketMaker.getInstance()
    val maker2: TicketMaker = TicketMaker.getInstance()

    println(maker.getNextTicketNumber())
    println(maker2.getNextTicketNumber())
    println(maker.getNextTicketNumber())
    println(maker2.getNextTicketNumber())

    println("End.")
}