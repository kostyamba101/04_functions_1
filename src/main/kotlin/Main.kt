const val TYPE_1 = "Mastercard"
const val TYPE_2 = "Maestro"
const val TYPE_3 = "Visa"
const val TYPE_4 = "Мир"
const val TYPE_5 = "VK Pay"

const val LIMIT = 75_000_00
const val OVER_THE_LIMIT_1 = 0.006
const val OVER_THE_LIMIT_2 = 20_00

const val PERCENTAGE_FOR_TYPE_3_4 = 0.0075
const val MIN_COMMISSION = 35_00

fun main(args: Array<String>) {
    val amount = 75600_00
    val type = TYPE_5
    val amountPreviousTransfers = 0
    calcPrint(amount,type, amountPreviousTransfers)
}

fun convert(amount: Int): String {
    return "${(amount / 100)} руб. ${amount % 100} коп. "
}

fun calcPrint(amount: Int, type: String, amountPreviousTransfers: Int){
    println("Сумма перевода: " + convert(amount))
    println("Тип карты: $type")
    println("Коммисия за перевод: " + convert(calcCommission(amount, type, amountPreviousTransfers)))
    println("Cумма перевода с учетом коммисии: " + convert((amount - calcCommission(amount, type, amountPreviousTransfers))))
}

fun calcCommission(amount: Int, type: String, amountPreviousTransfers: Int): Int {
    return when (type){
        TYPE_1, TYPE_2 -> {
            val commissionForType12: Double = amount * OVER_THE_LIMIT_1 + OVER_THE_LIMIT_2
            if((amountPreviousTransfers + amount) in (0..LIMIT)) 0
            else commissionForType12.toInt()
        }
        TYPE_3, TYPE_4 -> {
            val commissionForType34: Double = amount * PERCENTAGE_FOR_TYPE_3_4
            if (commissionForType34 < MIN_COMMISSION) MIN_COMMISSION / 100
            else commissionForType34.toInt()
        }
        else -> 0
    }
}