fun main() {

    println("Hello, world!!!")

    var intValue : Int = 123
    println(intValue)
    var longValue : Long = 1234L
    println(longValue)

    var nullInt : Int? = null

    var a : Int = 123
    println(a)
    var b : Long = a.toLong()
    println(b)

    var intArr = arrayOf(1, 2, 3, 4, 5)
    var nullArr = arrayOfNulls<Int>(5)
    intArr[2] = 8
    println(intArr[4])

    println(add(1, 2, 3))

    var aa = 7
    if (aa > 10)    println("aa는 10보다 크다")
    else            println("a는 10보다 같거나 작다")
    if (aa is Int)  println("aa는 int형 입니다")
    else            println("aa는 int형이 아닙니다")

    doWhen(1)
    doWhen("DiMo")
    doWhen(12L)
    doWhen(3.141592)
    doWhen("Kotlin")

    for (i in aa..a) {
        print(i)
    }
    println()
    for (i in 0 until 9) {
        print(i)
    }
    println()
    for (i in 9 downTo 0) {
        print(i)
    }

}

fun add (a : Int, b : Int, c : Int) = a + b + c

fun doWhen (a : Any) {
    return when(a) {
        1 -> println("정수 1입니다")
        "DiMo" -> println("디모의 코틀린입니다")
        is Long -> println("Long 타입입니다")
        !is String -> println("String 타입이 아닙니다")
        else -> println("어떤 조건도 만족하지 않습니다")
    }
}