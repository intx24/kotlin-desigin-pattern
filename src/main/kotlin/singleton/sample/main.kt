package singleton.sample

import factory_method.sample.framework.Factory
import factory_method.sample.framework.Product
import factory_method.sample.idcard.IDCardFactory

fun main(args: Array<String>) {
    println("Start.")
    val obj1 = Singleton.getInstance()
    val obj2 = Singleton.getInstance()
    println(obj1 == obj2)
    println("End.")
}