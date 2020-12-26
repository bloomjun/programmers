package junne.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Q12916Test {
    Q12916 question = new Q12916();

    @Test
    public void case_1() {
        var s = "pPoooyY";

        var answer = question.solution(s);
        assertTrue(answer);
    }

    @Test
    public void case_2() {
        var s = "Pyy";

        var answer = question.solution(s);
        assertFalse(answer);
    }
}