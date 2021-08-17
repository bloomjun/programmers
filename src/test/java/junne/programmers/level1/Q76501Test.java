package junne.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Q76501Test {

    @Test
    void test1() {
        var absolutes = new int[]{4, 7, 12};
        var signs = new boolean[]{true, false, true};

        var question = new Q76501();
        var actual = question.solution(absolutes, signs);

        var expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void test2() {
        var absolutes = new int[]{1, 2, 3};
        var signs = new boolean[]{false, false, true};

        var question = new Q76501();
        var actual = question.solution(absolutes, signs);

        var expected = 0;
        assertEquals(expected, actual);
    }
}