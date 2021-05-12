package com.tom

import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

fun main() {
    //改寫用with
    val url = URL("https://data.tycg.gov.tw/opendata/datalist/datasetMeta/download?id=f4cc0b12-86ac-40f9-8745-885bddc18f79&rid=0daad6e6-0632-44f5-bd25-5e1de1e9146f")
    println(url.readText())


   /* with(url.openConnection() as HttpURLConnection){
        val br = inputStream.bufferedReader().lines().forEach {
            println(it)
        }

    }*/


  /*  和照JAVA的寫法
  val url = URL("https://data.tycg.gov.tw/opendata/datalist/datasetMeta/download?id=f4cc0b12-86ac-40f9-8745-885bddc18f79&rid=0daad6e6-0632-44f5-bd25-5e1de1e9146f")
    val connetion= url.openConnection() as HttpURLConnection
    val br = BufferedReader(InputStreamReader(connetion.inputStream))
    var line =br.readLine()
    val json=StringBuffer()
    while (line != null){
        json.append(line)
        line = br.readLine()
    }
    println(json)*/

}