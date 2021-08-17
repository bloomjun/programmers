package junne.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Q81301Test {

    @Test
    void test1() {
        var s = "one4seveneight";

        var question = new Q81301();
        var actual = question.solution(s);

        var expected = 1478;
        assertEquals(expected, actual);
    }

    @Test
    void test2() {
        var s = "23four5six7";

        var question = new Q81301();
        var actual = question.solution(s);

        var expected = 234567;
        assertEquals(expected, actual);
    }

    @Test
    void test3() {
        var s = "2three45sixseven";

        var question = new Q81301();
        var actual = question.solution(s);

        var expected = 234567;
        assertEquals(expected, actual);
    }

    @Test
    void test4() {
        var s = "123";

        var question = new Q81301();
        var actual = question.solution(s);

        var expected = 123;
        assertEquals(expected, actual);
    }
}