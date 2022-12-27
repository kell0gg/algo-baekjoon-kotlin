package 수들의_합_2018

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()

    var left = 1
    var right = 1
    var sum = 1
    var count = 0
    while (right <= n) {
        if (sum == n) {
            count++
            right++
            sum += right
        } else if (sum < n) {
            right++
            sum += right
        } else {
            sum -= left
            left++
        }
    }
    println(count)
    br.close()
}

class Solution {
}
