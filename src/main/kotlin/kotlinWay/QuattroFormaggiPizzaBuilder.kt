package kotlinWay

class QuattroFormaggiPizzaBuilder : Pizza.Builder() {
    override var dough = "thick"
    override var sauce = "tomato mild"
    override var topping = "mozzarella + parmesan + gorgonzola + artichokes + oregano"
}