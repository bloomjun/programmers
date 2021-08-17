package junne.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Q12977Test {

    @Test
    void test1() {
        var nums = new int[]{1, 2, 3, 4};

        var question = new Q12977();
        var actual = question.solution(nums);

        var expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void test2() {
        var nums = new int[]{1, 2, 7, 6, 4};

        var question = new Q12977();
        var actual = question.solution(nums);

        var expected = 4;
        assertEquals(expected, actual);
    }
}