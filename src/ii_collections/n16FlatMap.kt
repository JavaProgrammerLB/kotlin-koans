package ii_collections

fun example() {

    val result = listOf("abc", "12").flatMap { it.toList() }

    result == listOf('a', 'b', 'c', '1', '2')
}

val Customer.orderedProducts: Set<Product> get() {
    // Return all products this customer has ordered
    var orderList:List<Order> = this.orders
    var result:HashSet<Product> = HashSet<Product>()
    for(order in orderList){
        var products:List<Product> = order.products
        var productSet:Set<Product> = products.toSet()
        result.addAll(productSet)
    }
    return result
}

val Shop.allOrderedProducts: Set<Product> get() {
    // Return all products that were ordered by at least one customer
    var result:HashSet<Product> = HashSet<Product>()
    var customers:List<Customer> = this.customers
    for (customer in customers){
        var orders:List<Order> = customer.orders
        for (order in orders){
            var products:List<Product> = order.products
            result.addAll(products)
        }
    }
    return result
}
