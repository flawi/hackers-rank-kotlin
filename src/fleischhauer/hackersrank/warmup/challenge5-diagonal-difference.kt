package fleischhauer.hackersrank.warmup

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val matrixSize: Int = scanner.nextInt()
    scanner.nextLine()
    val matrix: Array<IntArray> = Array(matrixSize, { i ->
        scanner.nextLine()
                .split(" ")
                .map { s -> s.toInt() }
                .toIntArray()
    })

    var primarySum = 0
    var secondarySum = 0
    for (row in 0 until matrixSize) {
        primarySum += matrix[row][row]
        secondarySum += matrix[row][matrixSize - row - 1]
    }

    System.out.println("${Math.abs(primarySum - secondarySum)}")
}