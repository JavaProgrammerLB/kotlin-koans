package ii_collections

fun example8() {
    val numbers = listOf(1, 3, -4, 2, -11)

    // The details (how multi-assignment works) will be explained later in the 'Conventions' task
    val (positive, negative) = numbers.partition { it > 0 }

    positive == listOf(1, 3, 2)
    negative == listOf(-4, -11)
}

fun Shop.getCustomersWithMoreUndeliveredOrdersThanDelivered(): Set<Customer> {
    // Return customers who have more undelivered orders than delivered
    val customers = this.customers
    val result = HashSet<Customer>()
    for (custom in customers){
        var orders = custom.orders
        var delivered = 0
        var undelivered = 0
        for (order in orders){
            if(order.isDelivered){
                delivered ++
            } else{
                undelivered ++
            }
        }
        if (delivered < undelivered){
            result.add(custom)
        }
    }
    return result
}

fun examples8(){
    val numbers = listOf(1, 3, -4, 2, -11)
    val (positive, negative) = numbers.partition { it > 0 }
    positive == listOf(1, 3, 2)
    negative == listOf(-4, -11)
}
