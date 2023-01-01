package 최솟값_찾기_11003

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()
    st = StringTokenizer(br.readLine())

    val deque: ArrayDeque<Node> = ArrayDeque(n)

    for (i in 0 until n) {
        val currentValue = st.nextToken().toInt()
        while (!deque.isEmpty() && deque.last.value > currentValue) {
            deque.pollLast()
        }
        deque.addLast(Node(i, currentValue))

        if (deque.first.idx == (i - m)) {
            deque.pollFirst()
        }

        bw.write("${deque.first.value} ")
    }

    bw.flush()
    bw.close()
    br.close()
}

class Node(val idx: Int, val value: Int)

class Solution {
}
