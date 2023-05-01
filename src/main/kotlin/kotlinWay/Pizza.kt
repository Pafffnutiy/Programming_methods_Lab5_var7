package kotlinWay

class Pizza (
    private val dough: String,
    private val sauce: String,
    private val topping: String
) {

    private constructor(builder: Builder) : this(builder.dough, builder.sauce, builder.topping)

    companion object {
        inline fun build(block: Builder.() -> Unit) = Builder().apply(block).build()
    }

    override fun toString(): String {
        return "Dough: $dough\nSauce: $sauce\nTopping: $topping"
    }

    open class Builder {
        open var dough: String = ""
        open var sauce: String = ""
        open var topping: String = ""

        fun build() = Pizza(this)
    }
}