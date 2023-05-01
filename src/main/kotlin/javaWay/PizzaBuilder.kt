package javaWay

abstract class PizzaBuilder(var pizza: Pizza = Pizza()) {
    abstract fun addDough()
    abstract fun addSauce()
    abstract fun addTopping()
}