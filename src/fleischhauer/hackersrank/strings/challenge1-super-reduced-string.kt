package fleischhauer.hackersrank.strings

import java.util.*
import kotlin.text.RegexOption.IGNORE_CASE

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var stringToReduce: String = scanner.nextLine()
    val pattern = Regex("([a-z])\\1", IGNORE_CASE)

    while (pattern.containsMatchIn(stringToReduce)) {
        stringToReduce = stringToReduce.replaceFirst(pattern, "")
    }
    System.out.println(if (stringToReduce.isBlank()) "Empty String" else stringToReduce)
}