package junne.programmers.level1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Q68644Test {
    Q68644 question = new Q68644();

    @Test
    public void case_1() {
        int[] numbers = {2, 1, 3, 4, 1};
        int[] answer = question.solution(numbers);
        int[] expected = {2, 3, 4, 5, 6, 7};
        Assertions.assertArrayEquals(expected, answer);
    }

    @Test
    public void case_2() {
        int[] numbers = {5, 0, 2, 7};
        int[] answer = question.solution(numbers);
        int[] expected = {2, 5, 7, 9, 12};
        Assertions.assertArrayEquals(expected, answer);
    }
}