package fleischhauer.hackersrank.warmup


import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    scanner.nextLine() // ignore size of the array in first line
    val result: Int = scanner.nextLine().split(" ").map { s -> s.toInt() }.sum()
    scanner.close()

    System.out.println(result)
}