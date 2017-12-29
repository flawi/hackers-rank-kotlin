package fleischhauer.hackersrank.warmup

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    scanner.nextLine() // ignore size of array
    val numbers: List<Int> = scanner
            .nextLine()
            .split(" ")
            .map { it.toInt() }
    val maximum: Int = numbers.max()!!
    val candles: Int = numbers.count { it == maximum }
    System.out.println(candles)
}