package junne.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Q12910Test {
    Q12910 question = new Q12910();


    @Test
    public void case_1() {
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;

        var answer = question.solution(arr, divisor);
        int[] expected = {5, 10};

        assertArrayEquals(expected, answer);
    }

    @Test
    public void case_2() {
        int[] arr = {2, 36, 1, 3};
        int divisor = 1;

        var answer = question.solution(arr, divisor);
        int[] expected = {1, 2, 3, 36};

        assertArrayEquals(expected, answer);
    }

    @Test
    public void case_3() {
        int[] arr = {3, 2, 6};
        int divisor = 10;

        var answer = question.solution(arr, divisor);
        int[] expected = {-1};

        assertArrayEquals(expected, answer);
    }
}