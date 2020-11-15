package junne.programmers.level1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Q64061Test {
    Q64061 question = new Q64061();

    @Test
    public void case_1() {
        int[][] board = {
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 3},
                {0, 2, 5, 0, 1},
                {4, 2, 4, 4, 2},
                {3, 5, 1, 3, 1}
        };
        int[] move = {1, 5, 3, 5, 1, 2, 1, 4};

        var answer = question.solution(board, move);
        int expected = 4;

        Assertions.assertEquals(expected, answer);
    }
}