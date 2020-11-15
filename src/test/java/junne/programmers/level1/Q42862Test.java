package junne.programmers.level1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Q42862Test {
    Q42862 question = new Q42862();

    @Test
    void case_1() {
        var n = 5;
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};

        var answer = question.solution(n, lost, reserve);
        var expected = 5;
        Assertions.assertEquals(expected, answer);
    }

    @Test
    void case_2() {
        var n = 5;
        int[] lost = {2, 4};
        int[] reserve = {3};

        var answer = question.solution(n, lost, reserve);
        var expected = 4;
        Assertions.assertEquals(expected, answer);
    }

    @Test
    void case_3() {
        var n = 3;
        int[] lost = {3};
        int[] reserve = {1};

        var answer = question.solution(n, lost, reserve);
        var expected = 2;
        Assertions.assertEquals(expected, answer);
    }

    @Test
    void case_4() {
        var n = 2;
        int[] lost = {1};
        int[] reserve = {2};

        var answer = question.solution(n, lost, reserve);
        var expected = 2;
        Assertions.assertEquals(expected, answer);
    }
}