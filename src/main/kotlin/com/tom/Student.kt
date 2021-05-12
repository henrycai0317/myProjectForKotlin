package com.tom

import java.util.*

fun main() {
//    userInput()
    Student.pass=50
    val stu = Student("Henry", 60, 99)
    val stu1 = Student("Eric", 40, 99)
    val stu2 = Student("Tom", 60, 39)
    val gstu = GraduateStudent("Jack",60,60,60)

    gstu.print()
    stu.print()
    stu1.print()
    stu2.print()
    stu.nameCheck()
    var test=123
    println("Test is $test")//一般的值可以直接放$
    println("Highest score: ${stu.highest()}")//方法呼叫要加${}
}

class GraduateStudent(name: String?,english: Int,math: Int,var thesis:Int) : Student(name,english,math){
    companion object{

        var pass = 70
    }

    override fun print() {
        println("$name\t$english\t$math\t$thesis\t${getAverage()}\t${passOrFailed()}\t${grading()}")
    }

    override fun passOrFailed()=if (getAverage() > pass) "PASS" else "FAIELD"
}

open class Student (var name:String?,var english:Int,var math:Int){
    companion object{
        @JvmStatic
        var pass=60
        fun test(){
            println("testing")
        }

    }

    //如果想接收null一定要在資料型態後面＋？
    open fun print(){
        println("$name\t$english\t$math\t${getAverage()}\t${passOrFailed()}\t${grading()}")
      /*  print(name+"\t"+english+"\t"+math+"\t"
                +getAverage()+"\t"
                +passOrFailed())*/
//        println("\t"+grading())

    }
    //function的定義 可以是運算後的結果
    fun grading() =when(getAverage()){
        in 90..100 -> 'A'
        in 80..89 -> 'B'
        in 70..79 -> 'C'
        in 60..69 -> 'D'
        else -> 'F'
    }
    open fun passOrFailed() = if(getAverage() >= pass) "PASS" else "FAILED"

    fun getAverage()=(english+math)/2

    fun highest() =if(english>math) {
        println("english")
        english
    } else {
        println("math")
        math
    }

    fun nameCheck(){
        println(name?.length)
    }
}
private fun userInput() {
    val scanner = Scanner(System.`in`)
    /* print("Please enter student's name:")
    var name = scanner.next()*/
    var name = null
    print("Please enter student's english:")
    var english = scanner.nextInt()
    print("Please enter student's math:")
    var math = scanner.nextInt()
    val stu = Student(name, english, math)
    stu.print()
    stu.nameCheck()
}

