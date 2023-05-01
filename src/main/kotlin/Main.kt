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
}

fun kotlinWayMain() {
    val pizza = Pizza.build {
        dough = "thick"
        sauce = "hot"
        topping = "pineapple"
    }
    println(pizza)
    println()

    val seafoodPizzaBuilder = kotlinWay.SeafoodPizzaBuilder()
    val pepperoniPizzaBuilder = kotlinWay.PepperoniPizzaBuilder()
    val quattroFormaggiPizzaBuilder = kotlinWay.QuattroFormaggiPizzaBuilder()

    val waiter1 = kotlinWay.Waiter(seafoodPizzaBuilder)
    val waiter2 = kotlinWay.Waiter(pepperoniPizzaBuilder)
    val waiter3 = kotlinWay.Waiter(quattroFormaggiPizzaBuilder)

    println(waiter1.constructPizza())
    println()
    println(waiter2.constructPizza())
    println()
    println(waiter3.constructPizza())
    println()
}

fun main() {
    println("JavaWay")
    println()
    javaWayMain()
    println()
    println("KotlinWay")
    println()
    kotlinWayMain()
}