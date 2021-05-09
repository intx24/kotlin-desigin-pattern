package factory_method.sample.idcard

import factory_method.sample.framework.Factory
import factory_method.sample.framework.Product

class IDCardFactory : Factory() {
    private val owners: MutableList<String> = mutableListOf()
    override fun createProduct(owner: String): Product {
        return IDCard(owner)
    }

    override fun registerProduct(product: Product) {
        owners.add((product as IDCard).getOwner())
    }
}