package fleischhauer.hackersrank.warmup

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    scanner.nextLine() // ignore length of numbers
    val result = scanner.nextLine()
            .split(" ")
            .map { s -> s.toLong() }
            .sum()
    System.out.println(result)
}