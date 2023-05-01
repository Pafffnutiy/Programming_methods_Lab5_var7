package kotlinWay

class PepperoniPizzaBuilder : Pizza.Builder() {
    override var dough = "thin"
    override var sauce = "hot tomato"
    override var topping = "pepperoni"
}