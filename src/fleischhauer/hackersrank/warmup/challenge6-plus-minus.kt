package fleischhauer.hackersrank.warmup

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    scanner.nextLine() // ignore size of array
    val numbers: List<Int> = scanner.nextLine()
            .split(" ")
            .map { s -> s.toInt() }

    val numberCount = numbers.size
    val positiveNumbers: Double = numbers.count { i -> i > 0 }.toDouble()
    val negativeNumbers: Double = numbers.count { i -> i < 0 }.toDouble()
    val zeros: Double = numberCount - positiveNumbers - negativeNumbers

    System.out.println(positiveNumbers / numberCount)
    System.out.println(negativeNumbers / numberCount)
    System.out.println(zeros / numberCount)
}