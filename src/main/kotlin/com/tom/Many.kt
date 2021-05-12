package com.tom

import java.time.LocalDateTime

fun main() {
    val parlingLot=HashMap<String,Car?>()
    var enter= LocalDateTime.of(2021,5,9,12,0,0)
    var car:Car? = Car("AAA-0001",enter)
    parlingLot.put(car!!.id,car)
    car = Car("BBB-0002",enter.plusMinutes(15))
    parlingLot.put(car.id,car)
    var leave = LocalDateTime.of(2021,5,9,13,0,0)
    //Car 1 leaving
    car= parlingLot.get("AAA-0001")
    car?.leave=leave
    println("${car?.id} duration: ${car?.duration()}")
    parlingLot.remove(car?.id)
    println(parlingLot.size)
    //Car 2 leaving
    car=parlingLot.get("BBB-0002")
    car?.leave=leave.plusHours(2)
    println("${car?.id} duration : ${car?.duration()}")
    parlingLot.remove(car?.id)
    println(parlingLot.size)
  /*  val list = listOf(5,1,2,7)
    println(list)
    val scores= listOf(66,88,77,55,33)
    for (score in scores){
        println(score)
    }
    println(list.get(3))

    var mutableList = mutableListOf(5,1,2,7)
    mutableList.add(6)
    println(mutableList)*/
}