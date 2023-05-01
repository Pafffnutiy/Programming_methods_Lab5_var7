package kotlinWay

class Pizza (
    val dough: String,
    val sauce: String,
    val topping: String
) {

    private constructor(builder: Builder) : this(builder.dough, builder.sauce, builder.topping)

    companion object {
        inline fun build(block: Builder.() -> Unit) = Builder().apply(block).build()
    }

    override fun toString(): String {
        return "Dough: $dough\nSauce: $sauce\nTopping: $topping"
    }

    open class Builder {
        var dough: String = ""
        var sauce: String = ""
        var topping: String = ""

        fun build() = Pizza(this)
    }
}