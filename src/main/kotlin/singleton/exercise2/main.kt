package singleton.exercise2

import factory_method.sample.framework.Factory
import factory_method.sample.framework.Product
import factory_method.sample.idcard.IDCardFactory

fun main(args: Array<String>) {
    println("Start.")
    val triple0: Triple = Triple.getInstance(0)
    println(triple0.toString())
    val triple1: Triple = Triple.getInstance(1)
    println(triple1.toString())
    val triple2: Triple = Triple.getInstance(2)
    println(triple2.toString())
//    val triple3: Triple = Triple.getInstance(3)

    println("End.")
}