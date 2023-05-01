package kotlinWay

class PepperoniPizzaBuilder : Pizza.Builder() {
    fun addDough() {
        dough = "thin"
    }

    fun addSauce() {
        sauce = "hot tomato"
    }

    fun addTopping() {
        topping = "pepperoni"
    }
}