package junne.programmers.level2;

import junne.programmers.level2.Q42577;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q42577Test {
    Q42577 question = new Q42577();

    @Test
    void test_1() {
        String[] phoneBook = {"119", "97674223", "1195524421"};

        boolean answer = question.solution(phoneBook);

        assertFalse(answer);
    }

    @Test
    void test_2() {
        String[] phoneBook = {"123", "456", "789"};

        boolean answer = question.solution(phoneBook);

        assertTrue(answer);
    }

    @Test
    void test_3() {
        String[] phoneBook = {"12", "123", "1235", "567", "88"};

        boolean answer = question.solution(phoneBook);

        assertFalse(answer);
    }
}