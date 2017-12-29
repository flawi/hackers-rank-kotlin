package fleischhauer.hackersrank.warmup

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val numbers: List<Long> = scanner.nextLine()
            .split(" ")
            .map { s -> s.toLong() }
            .sorted()
    val minimum: Long = numbers.subList(0, numbers.size - 1).sum()
    val maximum: Long = numbers.subList(1, numbers.size).sum()

    System.out.println("$minimum $maximum")
}