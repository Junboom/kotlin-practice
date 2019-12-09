fun main() {

    for (i in 1..10) {
        if (i == 3) break
        print(i)
    }
    println()
    for (i in 1..10) {
        if (i == 3) continue
        print(i)
    }

    loop@for (i in 1..10) {
        for (j in 1..10) {
            if (i == 1 && j == 2)   break@loop
            println("i : $i, j : $j")
        }
    }

    println(true && false)
    println(true || false)

    var a = Person("박보영", 1990)
    var b = Person("진정국", 1997)
    var c = Person("장은영", 2004)

    var d = Person("아루다")
    var e = Person("차은우")
    var f = Person("이준범")

    a.introduce()
    b.introduce()
    c.introduce()

    var aa = Animal("별이", 5, "개")
    var bb = Dog("별이",5)

    aa.introduce()
    bb.introduce()

}

class Person (var name : String, val birthYear : Int) {
    init {
        println("${birthYear}년생 ${name}님이 생성되었습니다")
    }

    constructor(name : String) : this(name, 1997) {
        println("보조 생성자가 사용되었습니다")
    }

    fun introduce() {
        println("안녕하세요, ${birthYear}년생 ${name}입니다")
    }
}

open class Animal (var name : String, var age : Int, var type : String) {
    fun introduce() {
        println("저는 ${type} ${name}이고, ${age}살 입니다")
    }
}

class Dog (name: String, age : Int) : Animal(name, age, "개")
