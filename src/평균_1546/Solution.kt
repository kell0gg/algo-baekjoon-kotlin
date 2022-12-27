package 평균_1546

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main(args: Array<String>) {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = br.readLine().toInt()
    val st = StringTokenizer(br.readLine())

    var max = 0.0
    var sum = 0.0
    for (i in 0 until n) {
        val score = st.nextToken().toDouble()
        if (score > max) max = score
        sum += score
    }

    bw.write(String.format("%f\n", ((sum / max) * 100) / n))
    bw.flush()
    br.close()
    bw.close()
}

class Solution {
}
