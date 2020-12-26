package junne.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Q12915Test {
    Q12915 question = new Q12915();

    @Test
    void case_1() {
        String[] strings = {"sun", "bed", "car"};
        int n = 1;

        var answer = question.solution(strings, n);
        String[] expected = {"car", "bed", "sun"};
        assertArrayEquals(expected, answer);
    }

    @Test
    void case_2() {
        String[] strings = {"abce", "abcd", "cdx"};
        int n = 2;

        var answer = question.solution(strings, n);
        String[] expected = {"abcd", "abce", "cdx"};
        assertArrayEquals(expected, answer);
    }
}