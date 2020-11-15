package junne.programmers.level2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Q42578Test {
    Q42578 question = new Q42578();

    @Test
    void test_1() {
        String[][] clothes = {
                {"yellow_hat", "headgear"},
                {"blue_sunglasses", "eyewear"},
                {"green_turban", "headgear"}
        };

        int answer = question.solution(clothes);

        assertEquals(5, answer);
    }

    @Test
    void test_2() {
        String[][] clothes = {
                {"crow_mask", "face"},
                {"blue_sunglasses", "face"},
                {"smoky_makeup", "face"}
        };

        int answer = question.solution(clothes);

        assertEquals(3, answer);
    }
}