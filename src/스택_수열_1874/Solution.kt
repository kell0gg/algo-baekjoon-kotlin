package 스택_수열_1874

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main(args: Array<String>) {
    var flag = true
    val br = BufferedReader(InputStreamReader(System.`in`))
    val sb = StringBuilder()
    val stack: Stack<Int> = Stack()
    val n = br.readLine().toInt()
    var currentNumber = 1
    val sequenceArray = IntArray(n)
    for (i in 0 until n) {
        sequenceArray[i] = br.readLine().toInt()
    }

    for (i in sequenceArray.indices) {
        val target = sequenceArray[i]
        if (target >= currentNumber) {
            while (target >= currentNumber) {
                stack.push(currentNumber++)
                sb.append("+\n")
            }
            stack.pop()
            sb.append("-\n")
        } else {
            val tmp = stack.pop()
            if (tmp == target) {
                sb.append("-\n")
            } else {
                println("NO")
                flag = false
                break;
            }
        }
    }
    if (flag) println(sb.toString())
}

class Solution {
}
