package fleischhauer.hackersrank.constructivealgorithms

import java.util.*

/**
 * see <a href="https://www.hackerrank.com/challenges/new-year-chaos/problem"></a>
 */
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    scanner.use {
        val rounds = scanner.nextInt()
        scanner.nextLine() // scan to the end of the line, to wait for additional input
        for (i in (0 until rounds)) {
            scanner.nextLine() // ignore number of numbers
            val unsorted: List<Int> = scanner.nextLine().split(" ").map { it.toInt() }
            val minBribes = getMinimalBribes(unsorted.toMutableList())
            System.out.println(if (minBribes > -1) minBribes else "Too chaotic")
        }
    }
}

/**
 * This function is determining the minimal number ob bribes to get the queue in the given state.
 * It excepts the input queue as parameter and executes a Bubble Sort on it. Every time the algorithm
 * swaps numbers in the queue, a bribe is detected. Bribes are tracked in a map per queue position in
 * order to a) detect if a number bribes more than 2 times and b) to sum up the minimal bribes in the end.
 *
 * @param queue The queue in it's imported state. This list will be sorted after running this method.
 * @return The minimal number of bribes or -1 if a Person (number in queue) bribes more than 2 times
 * (= Too chaotic)
 *
 */
fun getMinimalBribes(queue: MutableList<Int>): Int {
    // create a map of a number in the list to the number of detected bribes
    val bribes: MutableMap<Int, Int> = mutableMapOf(*queue.map({ Pair(it, 0) }).toTypedArray())
    // Bubble Sort: it's optimized in the way, that no swap is detected in an run, the queue is sorted
    // and the algorithm can terminate
    do {
        var swapped = false
        for (i in (1 until queue.size)) {
            val previous = queue[i - 1]
            val current = queue[i]
            if (previous > current) {
                bribes[previous] = (bribes[previous]!!) + 1
                if (bribes[previous]!! > 2) {
                    return -1 // Too chaotic
                }

                queue[i] = previous
                queue[i - 1] = current
                swapped = true
            }
        }
    } while (swapped)

    // summing up the bribes
    return bribes.values.sum()
}