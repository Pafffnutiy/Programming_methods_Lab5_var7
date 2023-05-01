package kotlinWay

class QuattroFormaggiPizzaBuilder : Pizza.Builder() {
    fun addDough() {
        dough = "thick"
    }

    fun addSauce() {
        sauce = "tomato mild"
    }

    fun addTopping() {
        topping = "mozzarella + parmesan + gorgonzola + artichokes + oregano"
    }
}