package fleischhauer.hackersrank.warmup

import java.time.LocalTime
import java.time.format.DateTimeFormatter
import java.util.*

fun main(args: Array<String>) {
    val sourceFormat: DateTimeFormatter = DateTimeFormatter.ofPattern("hh:mm:ssa")
    val targetFormat: DateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss")

    val scanner = Scanner(System.`in`)
    val dateString: String = scanner.nextLine()
    val date: LocalTime = LocalTime.parse(dateString, sourceFormat)
    System.out.println(date.format(targetFormat))
}