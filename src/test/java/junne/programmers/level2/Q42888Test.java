package junne.programmers.level2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Q42888Test {
    Q42888 question = new Q42888();

    @Test
    void test_1() {
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"};

        String[] answer = question.solution(record);

        String[] expected = {"Prodo님이 들어왔습니다.", "Ryan님이 들어왔습니다.", "Prodo님이 나갔습니다.", "Prodo님이 들어왔습니다."};
        assertArrayEquals(expected, answer);
    }
}