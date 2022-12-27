package 나머지_합_10986

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()

    st = StringTokenizer(br.readLine())
    val sumArr = LongArray(n + 1) { 0 }
    for (i in 1 until n + 1) {
        sumArr[i] = sumArr[i - 1] + st.nextToken().toLong()
    }

    var count = 0L

    val map = LongArray(m) { 0 }
    for (i in 1 until n + 1) {
        val remainder = (sumArr[i] % m).toInt()
        if (remainder == 0) count++
        map[remainder]++
    }

    // if s[i] % m == s[j] % m then (s[i] - s[j]) % m == 0
    for (i in 0 until m) {
        if (map[i] >= 2) {
            count = (count + map[i] * (map[i] - 1) / 2)
        }
    }

    println(count)
    br.close()
}

class Solution {
}
