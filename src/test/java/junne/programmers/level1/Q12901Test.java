package junne.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Q12901Test {
    Q12901 question = new Q12901();

    @Test
    void case_1() {
        var a = 5;
        var b = 24;
        var answer = question.solution(a, b);
        var expected = "TUE";
        assertEquals(expected, answer);
    }
}