package kotlinWay

class SeafoodPizzaBuilder : Pizza.Builder() {
    fun addDough() {
        dough = "thick"
    }

    fun addSauce() {
        sauce = "cream"
    }

    fun addTopping() {
        topping = "shrimp + mussels + squid"
    }
}