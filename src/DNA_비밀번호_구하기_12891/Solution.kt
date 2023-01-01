package DNA_비밀번호_구하기_12891

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main(args: Array<String>) {
    val map = IntArray(4)
    val minCount = IntArray(4)
    val br = BufferedReader(InputStreamReader(System.`in`))
    var st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()
    val dna = br.readLine()
    st = StringTokenizer(br.readLine())

    minCount[0] = st.nextToken().toInt()
    minCount[1] = st.nextToken().toInt()
    minCount[2] = st.nextToken().toInt()
    minCount[3] = st.nextToken().toInt()

    var left = 0
    var right = m - 1
    var count = 0;

    for (i in 0 until m) {
        map[convertDnaToInteger(dna[i])]++
    }

    while (right < dna.length) {
        var flag = true
        for (i in 0 until 4) {
            if (map[i] < minCount[i]) {
                flag = false
                break
            }
        }
        if (flag) {
            count++
        }
        map[convertDnaToInteger(dna[left])]--
        left++
        right++
        if (right < dna.length) {
            map[convertDnaToInteger(dna[right])]++
        }
    }
    println(count)

}

fun convertDnaToInteger(char: Char): Int {
    when (char) {
        'A' -> return 0
        'C' -> return 1
        'G' -> return 2
        'T' -> return 3
    }
    return -1
}

class Solution {
}
