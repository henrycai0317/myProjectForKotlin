package com.tom

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlin.system.measureTimeMillis

fun main() {
    var counter =1;
  /*  var ms= measureTimeMillis {
        for(n in 1..100_000){
            thread {
                counter++;
            }
        }
    }*/
    //執行可看出使用協程比執行緒效率差很大
    var ms = measureTimeMillis {
        for(n in 1..100_000){
            GlobalScope.launch {
                counter++;
            }
        }
    }
    println(ms)


}