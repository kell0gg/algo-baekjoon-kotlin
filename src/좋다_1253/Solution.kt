package 좋다_1253

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val st = StringTokenizer(br.readLine())
    val arr = LongArray(n) { 0L }
    for (i in 0 until n) {
        arr[i] = st.nextToken().toLong()
    }
    arr.sort()

    var count = 0

    for (i in 0 until n) {
        val find = arr[i]
        var left = 0
        var right = n - 1;

        while (left < right) {
            val tmpSum = arr[left] + arr[right]
            if (tmpSum == find) {
                // 0, 5, -5 의 경우에
                // 0 => 남은 두 개의 합
                // 5 => 5 + 0
                // -5 => -5 + 0 이런 식으로 자기 자신을 포함하게 됨
                if (left != i && right != i) {
                    count++
                    break
                } else if (left == i) {
                    left++
                } else {
                    right--
                }
            } else if (tmpSum > find) {
                right--
            } else {
                left++
            }
        }
    }
    println(count)
    br.close()
}

class Solution {
}
