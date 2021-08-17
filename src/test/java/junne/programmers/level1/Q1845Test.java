package junne.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Q1845Test {

    @Test
    void test1() {
        var nums = new int[]{3, 1, 2, 3};

        var question = new Q1845();
        var actual = question.solution(nums);

        var expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void test2() {
        var nums = new int[]{3, 3, 3, 2, 2, 4};

        var question = new Q1845();
        var actual = question.solution(nums);

        var expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    void test3() {
        var nums = new int[]{3, 3, 3, 2, 2, 2};

        var question = new Q1845();
        var actual = question.solution(nums);

        var expected = 2;
        assertEquals(expected, actual);
    }
}