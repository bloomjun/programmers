package junne.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Q72410Test {

    @Test
    void test1() {
        var newId = "...!@BaT#*..y.abcdefghijklm";

        var question = new Q72410();
        var actual = question.solution(newId);

        var expected = "bat.y.abcdefghi";
        assertEquals(expected, actual);
    }

    @Test
    void test2() {
        var newId = "z-+.^.";

        var question = new Q72410();
        var actual = question.solution(newId);

        var expected = "z--";
        assertEquals(expected, actual);
    }

    @Test
    void test3() {
        var newId = "=.=";

        var question = new Q72410();
        var actual = question.solution(newId);

        var expected = "aaa";
        assertEquals(expected, actual);
    }

    @Test
    void test4() {
        var newId = "123_.def";

        var question = new Q72410();
        var actual = question.solution(newId);

        var expected = "123_.def";
        assertEquals(expected, actual);
    }

    @Test
    void test5() {
        var newId = "abcdefghijklmn.p";

        var question = new Q72410();
        var actual = question.solution(newId);

        var expected = "abcdefghijklmn";
        assertEquals(expected, actual);
    }
}