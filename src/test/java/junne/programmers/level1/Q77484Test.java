package junne.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Q77484Test {

    @Test
    void test1() {
        var lottos = new int[]{44, 1, 0, 0, 31, 25};
        var winNums = new int[]{31, 10, 45, 1, 6, 19};

        var question = new Q77484();
        var actual = question.solution(lottos, winNums);

        var expected = new int[]{3, 5};
        assertArrayEquals(expected, actual);
    }

    @Test
    void test2() {
        var lottos = new int[]{0, 0, 0, 0, 0, 0};
        var winNums = new int[]{38, 19, 20, 40, 15, 25};

        var question = new Q77484();
        var actual = question.solution(lottos, winNums);

        var expected = new int[]{1, 6};
        assertArrayEquals(expected, actual);
    }

    @Test
    void test3() {
        var lottos = new int[]{45, 4, 35, 20, 3, 9};
        var winNums = new int[]{20, 9, 3, 45, 4, 35};

        var question = new Q77484();
        var actual = question.solution(lottos, winNums);

        var expected = new int[]{1, 1};
        assertArrayEquals(expected, actual);
    }

    @Test
    void test4() {
        var lottos = new int[]{1, 2, 3, 4, 5, 6};
        var winNums = new int[]{7, 8, 9, 10, 11, 12};

        var question = new Q77484();
        var actual = question.solution(lottos, winNums);

        var expected = new int[]{6, 6};
        assertArrayEquals(expected, actual);
    }
}