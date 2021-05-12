package com.tom

import java.time.Duration
import java.time.LocalDateTime

fun main() {
    val enter:LocalDateTime= LocalDateTime.of(2021,5,
                    9,12,0,0)
    val  leave:LocalDateTime= LocalDateTime.of(2021,5,
                    9,14,8,0)
    var car=Car("AAA-0001",enter)
    car.leave=leave
   println(car.duration())
    val hours= Math.ceil(car.duration()/60.0).toLong();
    println(hours)


}
class  Car(val id:String,val enter:LocalDateTime){
    var leave:LocalDateTime?=null
        set(value) {
            if(enter.isBefore(value))
                field=value //注意不可以使用this.leave這種屬性名稱會呼叫setter造成無窮迴圈


        }
    fun duration() = Duration.between(enter,leave).toMinutes()
}