package junne.programmers.level1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Q42840Test {
    Q42840 question = new Q42840();

    @Test
    public void case_1() {
        int[] answers = {1, 2, 3, 4, 5};
        var result = question.solution(answers);

        int[] expected = {1};
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    public void case_2() {
        int[] answers = {1, 3, 2, 4, 2};
        var result = question.solution(answers);

        int[] expected = {1, 2, 3};
        Assertions.assertArrayEquals(expected, result);
    }
}