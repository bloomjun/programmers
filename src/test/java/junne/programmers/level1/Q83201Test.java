package junne.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Q83201Test {
    Q83201 question = new Q83201();

    @Test
    void test1() {
        var scores = new int[][]{{100, 90, 98, 88, 65}, {50, 45, 99, 85, 77}, {47, 88, 95, 80, 67}, {61, 57, 100, 80, 65}, {24, 90, 94, 75, 65}};

        var actual = question.solution(scores);

        var expected = "FBABD";
        assertEquals(expected, actual);
    }

    @Test
    void test2() {
        var scores = new int[][]{{50, 90}, {50, 87}};

        var actual = question.solution(scores);

        var expected = "DA";
        assertEquals(expected, actual);
    }

    @Test
    void test3() {
        var scores = new int[][]{{70, 49, 90}, {68, 50, 38}, {73, 31, 100}};

        var actual = question.solution(scores);

        var expected = "CFD";
        assertEquals(expected, actual);
    }
}