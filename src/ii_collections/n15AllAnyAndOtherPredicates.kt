package ii_collections

fun example2(list: List<Int>) {

    val isZero: (Int) -> Boolean = { it == 0 }

    val hasZero: Boolean = list.any(isZero)

    val allZeros: Boolean = list.all(isZero)

    val numberOfZeros: Int = list.count(isZero)

    val firstPositiveNumber: Int? = list.firstOrNull { it > 0 }
}

fun Customer.isFrom(city: City): Boolean {
    // Return true if the customer is from the given city
    var customerCity:City = this.city
    if(customerCity == city){
        return true
    }
    return false
}

fun Shop.checkAllCustomersAreFrom(city: City): Boolean {
    // Return true if all customers are from the given city
    var customers:List<Customer> = this.customers
    for(custom in customers){
        var fromCity:City = custom.city
        if (fromCity != city){
            return false
        }
    }
    return true
}

fun Shop.hasCustomerFrom(city: City): Boolean {
    // Return true if there is at least one customer from the given city
    var customers:List<Customer> = this.customers
    for(custom in customers){
        var fromCity:City = custom.city
        if(fromCity == city){
            return true
        }
    }
    return false
}

fun Shop.countCustomersFrom(city: City): Int {
    // Return the number of customers from the given city
    var count:Int = 0
    var customers:List<Customer> = this.customers
    for(custom in customers){
        var fromCity:City = custom.city
        if(fromCity == city){
            count ++
        }
    }
    return count
}

fun Shop.findFirstCustomerFrom(city: City): Customer? {
    // Return the first customer who lives in the given city, or null if there is none
//    var customers:Li
    var customers:List<Customer> = this.customers
    for(custom in customers){
        var fromCity:City = custom.city
        if(fromCity == city){
            return custom
        }
    }
    return null
}
