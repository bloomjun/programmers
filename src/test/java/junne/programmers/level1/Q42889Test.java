package junne.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Q42889Test {
    Q42889 question = new Q42889();

    @Test
    void test1() {
        var n = 5;
        var stages = new int[]{2, 1, 2, 6, 2, 4, 3, 3};

        var actual = question.solution(n, stages);
        var expected = new int[]{3, 4, 2, 1, 5};

        assertArrayEquals(expected, actual);
    }

    @Test
    void test2() {
        var n = 4;
        var stages = new int[]{4, 4, 4, 4, 4};

        var actual = question.solution(n, stages);
        var expected = new int[]{4, 1, 2, 3};

        assertArrayEquals(expected, actual);
    }
}