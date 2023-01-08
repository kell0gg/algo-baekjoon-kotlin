package 오큰수_17298

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main(args: Array<String>) {

    // 더 작은 수는? 인덱스만 스택에 추가한다.
    // 더 큰 수는? 조건을 만족할 때까지 인덱스가 담긴 스택에서 제거하고 그 위치에 현재 값을 넣는다.

    val stack: Stack<Int> = Stack()
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = br.readLine().toInt()
    val st = StringTokenizer(br.readLine())
    val numArr = IntArray(n)
    val answer = IntArray(n)
    for (i in 0 until n) {
        numArr[i] = st.nextToken().toInt()
    }

    stack.push(0)

    for (i in 1 until n) {
        while (!stack.isEmpty() && numArr[stack.peek()] < numArr[i]) {
            answer[stack.pop()] = numArr[i];
        }
        stack.push(i)
    }

    while (!stack.isEmpty()) {
        answer[stack.pop()] = -1
    }

    answer.forEach { bw.write("$it ") }
    bw.flush()
    bw.close()
    br.close()
}

class Solution {
}
