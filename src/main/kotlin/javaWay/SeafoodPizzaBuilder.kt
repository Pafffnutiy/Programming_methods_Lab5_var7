package javaWay

class SeafoodPizzaBuilder : PizzaBuilder() {
    override fun addDough() {
        pizza.setDough("thick")
    }

    override fun addSauce() {
        pizza.setSauce("cream")
    }

    override fun addTopping() {
        pizza.setTopping("shrimp + mussels + squid")
    }
}