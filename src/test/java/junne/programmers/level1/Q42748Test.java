package junne.programmers.level1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Q42748Test {
    Q42748 question = new Q42748();

    @Test
    void case_1() {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {
                {2, 5, 3},
                {4, 4, 1},
                {1, 7, 3}
        };

        var answer = question.solution(array, commands);
        int[] expected = {5, 6, 3};
        Assertions.assertArrayEquals(expected, answer);
    }
}