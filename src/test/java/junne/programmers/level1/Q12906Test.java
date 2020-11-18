package junne.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Q12906Test {
    Q12906 question = new Q12906();

    @Test
    void case_1() {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};

        var answer = question.solution(arr);
        int[] expected = {1, 3, 0, 1};
        assertArrayEquals(expected, answer);
    }

    @Test
    void case_2() {
        int[] arr = {4, 4, 4, 3, 3};

        var answer = question.solution(arr);
        int[] expected = {4, 3};
        assertArrayEquals(expected, answer);
    }
}