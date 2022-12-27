package 숫자의_합_11720

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val numbers = br.readLine()
    var sum = 0
    for (number in numbers) {
        sum += number - '0'
    }
    bw.write(String.format("%d\n", sum))
    bw.flush()
    br.close()
    bw.close()
}

class Solution {
}
