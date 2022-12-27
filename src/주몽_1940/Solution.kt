package 주몽_1940

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    st = StringTokenizer(br.readLine())
    val m = st.nextToken().toInt()
    st = StringTokenizer(br.readLine())
    val arr = IntArray(n) { 0 }

    for (i in 0 until n) {
        arr[i] = st.nextToken().toInt()
    }

    arr.sort()

    var left = 0
    var right = n - 1;
    var count = 0;

    while (left < right) {
        val tmpSum = arr[left] + arr[right];
        if (tmpSum == m) {
            count++
            left++
            right--
        } else if (tmpSum < m) {
            left++
        } else {
            right--
        }
    }
    println(count)
    br.close()
}


class Solution {
}
