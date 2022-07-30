package 숫자의_합_11720

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    br.readLine()
    val nums = br.readLine()
    var sum = 0
    nums.forEach { sum += (it - '0') }
    println(sum)
    br.close()
}

class Solution {
}