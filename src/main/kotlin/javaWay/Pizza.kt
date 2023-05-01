package javaWay

class Pizza {
    private var dough = "" // тесто
    private var sauce = "" // соус
    private var topping = "" // начинка

    fun setDough(dough: String) {
        this.dough = dough
    }

    fun setSauce(sauce: String) {
        this.sauce = sauce
    }

    fun setTopping(topping: String) {
        this.topping = topping
    }

    override fun toString(): String {
        return "Dough: $dough\nSauce: $sauce\nTopping: $topping"
    }
}