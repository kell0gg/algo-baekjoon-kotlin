package 구간_합_구하기_4_11659

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*


fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()
    st = StringTokenizer(br.readLine())

    // 0은 제외하면 계산이 편해짐
    val sumArr = IntArray(n + 1) { 0 }
    sumArr[0] = 0

    // 합 배열
    for (i in 1 until n + 1) {
        sumArr[i] = sumArr[i - 1] + st.nextToken().toInt()
    }

    // 구간 합 구하기
    for (i in 0 until m) {
        st = StringTokenizer(br.readLine())
        val left = st.nextToken().toInt()
        val right = st.nextToken().toInt()
        println(sumArr[right] - sumArr[left - 1])
    }
}

class Solution {
}
