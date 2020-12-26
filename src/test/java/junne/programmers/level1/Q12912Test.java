package junne.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Q12912Test {
    Q12912 question = new Q12912();

    @Test
    public void case_1() {
        var a = 3;
        var b = 5;

        var answer = question.solution(a, b);
        var expected = 12L;

        assertEquals(expected, answer);
    }

    @Test
    public void case_2() {
        var a = 3;
        var b = 3;

        var answer = question.solution(a, b);
        var expected = 3L;

        assertEquals(expected, answer);
    }

    @Test
    public void case_3() {
        var a = 5;
        var b = 3;

        var answer = question.solution(a, b);
        var expected = 12L;

        assertEquals(expected, answer);
    }
}