package kotlinWay

class Waiter(private var pizzaBuilder: Pizza.Builder) {
    fun constructPizza() = pizzaBuilder.build()
}