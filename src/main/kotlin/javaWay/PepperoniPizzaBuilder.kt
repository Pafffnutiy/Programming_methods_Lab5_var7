package javaWay

class PepperoniPizzaBuilder : PizzaBuilder() {
    override fun addDough() {
        pizza.setDough("thin")
    }

    override fun addSauce() {
        pizza.setSauce("hot tomato")
    }

    override fun addTopping() {
        pizza.setTopping("pepperoni")
    }
}