package junne.programmers.level2;

import junne.programmers.level2.Q60057;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Q60057Test {
    Q60057 question = new Q60057();

    @Test
    void test_1() {
        String s = "aabbaccc";
        int answer = question.solution(s);
        assertEquals(7, answer);
    }

    @Test
    void test_2() {
        String s = "ababcdcdababcdcd";
        int answer = question.solution(s);
        assertEquals(9, answer);
    }

    @Test
    void test_3() {
        String s = "abcabcdede"	;
        int answer = question.solution(s);
        assertEquals(8, answer);
    }

    @Test
    void test_4() {
        String s = "abcabcabcabcdededededede";
        int answer = question.solution(s);
        assertEquals(14, answer);
    }

    @Test
    void test_5() {
        String s = "xababcdcdababcdcd";
        int answer = question.solution(s);
        assertEquals(17, answer);
    }
}