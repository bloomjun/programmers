package junne.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Q70128Test {

    @Test
    void test1() {
        var a = new int[]{1, 2, 3, 4};
        var b = new int[]{-3, -1, 0, 2};

        var question = new Q70128();
        var actual = question.solution(a, b);

        var expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    void test2() {
        var a = new int[]{-1, 0, 1};
        var b = new int[]{1, 0, -1};

        var question = new Q70128();
        var actual = question.solution(a, b);

        var expected = -2;
        assertEquals(expected, actual);
    }
}