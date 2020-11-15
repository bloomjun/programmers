package junne.programmers.level2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Q43165Test {
    Q43165 question = new Q43165();

    @Test
    void test_1() {
        int answer = question.solution(new int[]{1, 1, 1, 1, 1}, 3);
        assertEquals(5, answer);
    }
}