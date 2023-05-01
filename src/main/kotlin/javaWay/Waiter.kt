package javaWay

class Waiter(private var pizzaBuilder: PizzaBuilder) {
    val pizza: Pizza
        get() = pizzaBuilder.pizza

    fun constructPizza() {
        pizzaBuilder.addDough()
        pizzaBuilder.addSauce()
        pizzaBuilder.addTopping()
    }
}