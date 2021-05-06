package com.tom

fun main() {
//    println("Hello Kotlin");
//    Human().hello()
    //版本控制視窗 command + 9
    val h = Human()
    h.hello()

    var age:Int = 25;
    age = age.plus(1)
    val weight =65.2
    val control:Boolean = true
    print("age = "+age)
}
class Human{

    fun hello(){
        println("Hello Kotlin")
    }
}