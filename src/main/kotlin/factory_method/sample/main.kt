package factory_method.sample

import factory_method.sample.framework.Factory
import factory_method.sample.framework.Product
import factory_method.sample.idcard.IDCardFactory

fun main(args: Array<String>) {
    val f: Factory = IDCardFactory()
    val c1: Product = f.create("c1")
    val c2: Product = f.create("c2")
    val c3: Product = f.create("c3")

    c1.use()
    c2.use()
    c3.use()
}