package fleischhauer.hackersrank.warmup

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val listAlice: List<Int> = scanner.nextLine()
            .split(" ")
            .map { s -> s.toInt() }
    val listBob: List<Int> = scanner.nextLine()
            .split(" ")
            .map { s -> s.toInt() }
    if (listBob.size != listAlice.size) {
        throw IllegalArgumentException("rating lengths do not match")
    }
    if (listAlice.union(listBob).any { i -> i < 1 || i > 100 }) {
        throw IllegalArgumentException("contains value <1 or >100")
    }

    var scoreAlice = 0
    var scoreBob = 0
    listAlice.indices.forEach { i ->
        val aliceMinusBob: Int = listAlice[i] - listBob[i]
        if (aliceMinusBob > 0) {
            scoreAlice++
        } else if (aliceMinusBob < 0) {
            scoreBob++
        }
    }

    System.out.println("$scoreAlice $scoreBob")

}