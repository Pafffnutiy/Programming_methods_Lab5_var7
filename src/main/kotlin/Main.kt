import kotlinWay.Pizza

fun javaWayMain() {
    val seafoodPizzaBuilder = javaWay.SeafoodPizzaBuilder()
    val pepperoniPizzaBuilder = javaWay.PepperoniPizzaBuilder()
    val quattroFormaggiPizzaBuilder = javaWay.QuattroFormaggiPizzaBuilder()

    val waiter1 = javaWay.Waiter(seafoodPizzaBuilder)
    val waiter2 = javaWay.Waiter(pepperoniPizzaBuilder)
    val waiter3 = javaWay.Waiter(quattroFormaggiPizzaBuilder)

    waiter1.constructPizza()
    println(waiter1.pizza)
    println()

    waiter2.constructPizza()
    println(waiter2.pizza)
    println()

    waiter3.constructPizza()
    println(waiter3.pizza)
    println()
}

fun kotlinWayMain() {
    val pizza = Pizza.build {
        dough = "thick"
        sauce = "hot"
        topping = "pepperoni"
    }

    println(pizza)
}

fun main() {
    javaWayMain()
    kotlinWayMain()
}