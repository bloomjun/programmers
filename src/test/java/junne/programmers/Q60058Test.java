package junne.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Q60058Test {
    Q60058 question = new Q60058();

    @Test
    void test_1() {
        String answer = question.solution("(()())()");
        assertEquals("(()())()", answer);
    }

    @Test
    void test_2() {
        String answer = question.solution(")(");
        assertEquals("()", answer);
    }

    @Test
    void test_3() {
        String answer = question.solution("()))((()"	);
        assertEquals("()(())()", answer);
    }
}