package ii_collections

fun example4() {
    val max = listOf(1, 42, 4).max()
    val longestString = listOf("a", "b").maxBy { it.length }
}

fun Shop.getCustomerWithMaximumNumberOfOrders(): Customer? {
    // Return a customer whose order count is the highest among all customers
    val customers:List<Customer> = this.customers
    return customers.maxBy {
        it.orders.size
    }
}

fun Customer.getMostExpensiveOrderedProduct(): Product? {
    // Return the most expensive product which has been ordered
    val orders = this.orders
    var expensiveProducts = HashSet<Product>()
    for (order in orders){
        var products = order.products
        var expensiveProduct = products.maxBy { it.price }
        if (expensiveProduct != null){
            expensiveProducts.add(expensiveProduct)
        }
    }
    return expensiveProducts.maxBy { it.price }
}

fun examples5(){
    val max = listOf(1, 42, 4).max()
    val longsString = listOf("a", "b").maxBy { it.length }
}