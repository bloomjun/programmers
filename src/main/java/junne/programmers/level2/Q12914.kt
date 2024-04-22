package junne.programmers.level2

/**
 * @author junhyeon.kim@weversecompany.com
 */
class Q12914 {
    fun solution(n: Int): Long {
        val answer = LongArray(n + 2)
        answer[1] = 1
        answer[2] = 2

        for (i in 3 until n + 2) {
            answer[i] = (answer[i - 1] + answer[i - 2]) % 1234567
        }

        return answer[n]
    }
}