package 구간_합_구하기_5_11660

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()


    val sumArr = Array<IntArray>(n + 1) { IntArray(n + 1) { 0 } }

    // 합 배열 만들기
    // D[i][j] = D[i-1][j] + D[i][j-1] - D[i-1][j-1] + A[i][j]

    for (i in 1 until n + 1) {
        st = StringTokenizer(br.readLine())
        for (j in 1 until n + 1) {
            sumArr[i][j] = sumArr[i - 1][j] + sumArr[i][j - 1] - sumArr[i - 1][j - 1] + st.nextToken().toInt()
        }
    }

    // 구간 합 구하기 => D[x2][y2] - D[x1-1][y2] - D[x2][y1-1] + D[x1-1][y1-1]
    for (i in 0 until m) {
        st = StringTokenizer(br.readLine())
        val x1 = st.nextToken().toInt()
        val y1 = st.nextToken().toInt()
        val x2 = st.nextToken().toInt()
        val y2 = st.nextToken().toInt()
        val sum = sumArr[x2][y2] - sumArr[x1 - 1][y2] - sumArr[x2][y1 - 1] + sumArr[x1 - 1][y1 - 1]
        println(sum)
    }
}

class Solution {
}
