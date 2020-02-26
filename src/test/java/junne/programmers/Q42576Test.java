package junne.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q42576Test {
    Q42576 question = new Q42576();

    @Test
    void test_1() {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"kiki", "eden"};

        String answer = question.solution(participant, completion);

        assertEquals("leo", answer);
    }

    @Test
    void test_2() {
        String[] participant = {"marina", "josipa","nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};

        String answer = question.solution(participant, completion);

        assertEquals("vinko", answer);
    }

    @Test
    void test_3() {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        String answer = question.solution(participant, completion);

        assertEquals("mislav", answer);
    }
}