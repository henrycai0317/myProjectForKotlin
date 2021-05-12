package com.tom

import java.io.File

fun main() {
    File("data.txt").bufferedReader().lines().forEach {
        println(it)
    }

//    write()
}

fun write() {
//    File("output.txt").writeText("abc123")
    /* File("output.txt").printWriter().use {
      it.println("1st line")
      it.println("2nd line")
      it.println("3nd line")
  }*/
    //bufferedWriter()可寫出大量資料
    File("output.txt").bufferedWriter().use {
        it.write("1st line \n")
        it.write("2nd line\n")
        it.write("3nd line\n")
    }
}

