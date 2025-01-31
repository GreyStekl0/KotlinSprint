package org.stekl0.lesson_1

fun main(){
    var second = 6480
    var minute = second/60
    val hour = minute/60
    minute = minute%60
    println("0$hour:$minute:00")
}