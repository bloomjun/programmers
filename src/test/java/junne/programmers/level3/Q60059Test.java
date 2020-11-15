package junne.programmers.level3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Q60059Test {
    Q60059 question = new Q60059();

    @Test
    void test_1() {
        int[][] key = {
                {0, 0, 0},
                {1, 0, 0},
                {0, 1, 1}
        };
        int[][] lock = {
                {1, 1, 1},
                {1, 1, 0},
                {1, 0, 1}
        };

        boolean answer = question.solution(key, lock);

        assertTrue(answer);
    }

    @Test
    void test_2() {
        int[][] key = {
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}
        };
        int[][] lock = {
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}
        };

        boolean answer = question.solution(key, lock);

        assertTrue(answer);
    }

    @Test
    void test_3() {
        int[][] key = {
                {0, 0, 0},
                {0, 1, 0},
                {0, 1, 0}
        };
        int[][] lock = {
                {1, 0, 1, 1, 1},
                {1, 0, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1}
        };

        boolean answer = question.solution(key, lock);

        assertTrue(answer);
    }
}