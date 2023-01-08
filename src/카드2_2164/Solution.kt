package 카드2_2164

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()

    val q: Queue<Int> = LinkedList()

    for (i in 1 until (n + 1)) {
        q.add(i)
    }

    while (q.size > 1) {
        q.poll()
        q.add(q.poll())
    }

    println(q.poll())
}

class Solution {
}
