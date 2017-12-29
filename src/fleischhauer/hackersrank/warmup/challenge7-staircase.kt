package fleischhauer.hackersrank.warmup

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val size: Int = scanner.nextInt()
    (1 until size + 1)
            .map { "#".repeat(it) }
            .map { it.padStart(size) }
            .forEach { System.out.println(it) }
}