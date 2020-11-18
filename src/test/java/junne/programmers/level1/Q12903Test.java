package junne.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Q12903Test {
    Q12903 question = new Q12903();

    @Test
    public void case_1() {
        var s = "abced";
        var answer = question.solution(s);
        var expected = "c";
        assertEquals(expected, answer);
    }

    @Test
    public void case_2() {
        var s = "qwer";
        var answer = question.solution(s);
        var expected = "we";
        assertEquals(expected, answer);
    }
}