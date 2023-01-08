package 절대값_힙_11286

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.math.abs

fun main(args: Array<String>) {

    val pq: PriorityQueue<Int> = PriorityQueue<Int> { a, b ->
        when {
            abs(a) == abs(b) -> if (a > b) 1 else -1
            else -> (abs(a) - abs(b))
        }
    }
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = br.readLine().toInt()
    for (i in 0 until n) {
        val tmp = br.readLine().toInt()
        if (tmp == 0) {
            if (!pq.isEmpty()) {
                bw.write("${pq.poll()}\n")
            } else {
                bw.write("0\n")
            }
        } else {
            pq.add(tmp)
        }
    }
    bw.flush()
    bw.close()
    br.close()
}

class Solution {
}
