package factory_method.exercise

import factory_method.exercise.framework.Factory
import factory_method.exercise.framework.Product
import factory_method.exercise.idcard.IDCardFactory

fun main(args: Array<String>) {
    val f: Factory = IDCardFactory()
    val c1: Product = f.create("c1")
    val c2: Product = f.create("c2")
    val c3: Product = f.create("c3")

    c1.use()
    c2.use()
    c3.use()
}