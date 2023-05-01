package javaWay

class QuattroFormaggiPizzaBuilder : PizzaBuilder() {
    override fun addDough() {
        pizza.setDough("thick")
    }

    override fun addSauce() {
        pizza.setSauce("tomato mild")
    }

    override fun addTopping() {
        pizza.setTopping("mozzarella + parmesan + gorgonzola + artichokes + oregano")
    }
}