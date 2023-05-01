package kotlinWay

class SeafoodPizzaBuilder : Pizza.Builder() {
    override var dough = "thick"
    override var sauce = "cream"
    override var topping = "shrimp + mussels + squid"
}