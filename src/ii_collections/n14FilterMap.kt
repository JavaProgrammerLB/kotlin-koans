package ii_collections

fun example1(list: List<Int>) {

    // If a lambda has exactly one parameter, that parameter can be accessed as 'it'
    val positiveNumbers = list.filter { it > 0 }

    val squares = list.map { it * it }
}

fun Shop.getCitiesCustomersAreFrom(): Set<City> {
    // Return the set of cities the customers are from
//    todoCollectionTask()
    val customers = this.customers
    var cities:HashSet<City> = HashSet<City>()
    for (customer in customers){
        cities.add(customer.city)
    }
    return cities
}

fun Shop.getCustomersFrom(city: City): List<Customer> {
    // Return a list of the customers who live in the given city
    // todoCollectionTask()
    val customers = this.getSetOfCustomers()
    var resultCustomer:ArrayList<Customer>  = ArrayList<Customer>()
    for(customer in customers){
        if (customer.city == city){
            resultCustomer.add(customer)
        }
    }
    return resultCustomer

}


