package junne.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Q67256Test {

    @Test
    void test1() {
        var numbers = new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        var hand = "right";

        var question = new Q67256();
        var actual = question.solution(numbers, hand);

        var expected = "LRLLLRLLRRL";
        assertEquals(expected, actual);
    }

    @Test
    void test2() {
        var numbers = new int[]{7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        var hand = "left";

        var question = new Q67256();
        var actual = question.solution(numbers, hand);

        var expected = "LRLLRRLLLRR";
        assertEquals(expected, actual);
    }

    @Test
    void test3() {
        var numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        var hand = "right";

        var question = new Q67256();
        var actual = question.solution(numbers, hand);

        var expected = "LLRLLRLLRL";
        assertEquals(expected, actual);
    }
}