fun main() {

    var t = Tiger()
    t.eat()

    var d = Dog2()
    d.eat()
    d.run()

    b(::a)
    val c : (String)->Unit = {str->println("$str 람다함수")}

    var price = 5000

    var aa = Book("디모의 코틀린", 10000).apply {
        name = "[초특가]" + name
        discount()
    }

    aa.run {
        println("삼품명: ${name}, 가격: ${price}원입니다")
    }

}

open class Animal2 {
    open fun eat() {
        println("음식을 먹습니다")
    }
}

class Tiger : Animal2() {
    override fun eat() {
        println("고기를 먹습니다")
    }
}

abstract class Animal3 {
    abstract fun eat()
    fun sniff() {
        println("킁킁")
    }
}

class rabbit

interface Runner {
    fun run()
}

interface Eater {
    fun eat() {
        println("음식을 먹습니다")
    }
}

class Dog2 : Runner, Eater {
    override fun run() {
        println("우다다다 뜁니다")
    }
}

fun a (str : String) {
    println("$str 함수 a")
}

fun b (function : (String)->Unit) {
    function("b가 호출한")
}

class Book(var name:String, var price: Int) {
    fun discount() {
        price -= 2000
    }
}
