import java.io.File
import java.lang.NumberFormatException

fun main() {
    val inp = File("in/day01.txt")
        .readText()
        .split("\r\n\r\n")
        //.map { it.split("\r\n").filter{it.isNotEmpty()}.map{it.toInt()}}
        //.map{ it.sum() }
    println("partA: ${1}")
    println("partB: ${2}")
}