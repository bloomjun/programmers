package junne.programmers.level2

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

/**
 * @author junhyeon.kim@weversecompany.com
 */
class Q12914Test {
    private val question = Q12914()

    @Test
    fun test_1() {
        val n = 4
        val expect = 5L

        val answer = question.solution(n)

        assertEquals(expect, answer)
    }

    @Test
    fun test_2() {
        val n = 3
        val expect = 3L

        val answer = question.solution(n)

        assertEquals(expect, answer)
    }
}