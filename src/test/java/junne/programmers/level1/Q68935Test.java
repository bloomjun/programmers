package junne.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Q68935Test {
    Q68935 question = new Q68935();


    @Test
    void case_1() {
        int n = 45;
        var answer = question.solution(n);
        var expected = 7;
        assertEquals(expected, answer);
    }

    @Test
    void case_2() {
        int n = 125;
        var answer = question.solution(n);
        var expected = 229;
        assertEquals(expected, answer);
    }

    @Test
    void case_3() {
        // 3 / 9
        // 3 / 3 ... 0
        // 3 / 1 ... 0
        int n = 9;
        var answer = question.solution(n);
        var expected = 1;
        assertEquals(expected, answer);
    }
}