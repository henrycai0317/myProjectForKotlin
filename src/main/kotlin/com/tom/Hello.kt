package com.tom

fun main() {
//    println("Hello Kotlin");
//    Human().hello()
    //版本控制視窗 command + 9
    //Git Commit PUSH 快選 control + v
    var s:String?="abcde" //null處理 ＋?
//    s=null
    println(s?.length)
    println(s?.get(3))
    println(s?.substring(3))
    val h = Human(weight = 66.5f,height = 1.7f)
      println(h.bmi())
    val score=88
    val c:Char ='A'
    println(c.toInt()>60)
    println(score>60)


/*    var age:Int = 25;
    age = age.plus(1)
    val weight =65.2
    val control:Boolean = true
    print("age = "+age)*/

}
class Human (var name:String="",var weight:Float,var height:Float){
    init {
        println("test $weight")//init在建構子完成的時候會自動執行
    }
//    constructor(name:String,weight: Float,height: Float):this(weight,height)//次要建構子 ，Kotlin建構子分主要與次要

    fun bmi() : Float{
        var bmi = weight/(height*height)
        return  bmi;
    }
    fun hello(){
        println("Hello Kotlin")
    }
}