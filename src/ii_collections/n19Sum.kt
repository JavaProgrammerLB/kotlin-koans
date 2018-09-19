package ii_collections

fun example6() {
    listOf(1, 3).sum() == 4
    listOf("a", "b", "cc").sumBy { it.length } == 4
}

fun Customer.getTotalOrderPrice(): Double {
    // Return the sum of prices of all products that a customer has ordered.
    // Note: a customer may order the same product for several times.
    var orders = this.orders
    var result = 0.0
    for(order in orders){
        var products = order.products
        var sum = products.sumByDouble { it.price }
        result += sum
    }
    return result
}

fun examples6(){
    var sum = listOf(1, 3).sum()
    var sum2 = listOf("a", "b", "cc").sumBy { it.length }
}