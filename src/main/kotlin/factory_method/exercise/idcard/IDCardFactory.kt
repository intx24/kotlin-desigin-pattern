package factory_method.exercise.idcard

import IDCard
import factory_method.exercise.framework.Factory
import factory_method.exercise.framework.Product

class IDCardFactory : Factory() {
    private var latestNo: Int = 0
    private val map: MutableMap<Int, Product> = mutableMapOf()

    override fun createProduct(owner: String): Product {
        return IDCard(owner, latestNo)
    }

    override fun registerProduct(product: Product) {
        map[latestNo++] = (product as IDCard)
    }
}