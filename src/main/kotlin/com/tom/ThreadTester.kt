package com.tom

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.concurrent.thread

fun main() {
    Thread{
        for (i in 1..10){
            println("Tread:${i}")
            Thread.sleep(50)
        }
    }.start()

    thread {
        for(i in 1..10){
            println("thread()  ${i}")
            Thread.sleep(50)
        }
    }

    //輕量級的執行緒省CPU耗能資源
   GlobalScope.launch {
       for(i in 1..10){
           println("Coroutines : ${i}")
           delay(50L)
       }
   }
}
