package junne.programmers.level1;

import java.util.Objects;

public class Q67256 {

    public String solution(int[] numbers, String hand) {
        var keypadDist = new int[12][12];

        // 왼손
        keypadDist[1][2] = 1;
        keypadDist[1][5] = 2;
        keypadDist[1][8] = 3;
        keypadDist[1][0] = 4;

        keypadDist[4][2] = 2;
        keypadDist[4][5] = 1;
        keypadDist[4][8] = 2;
        keypadDist[4][0] = 3;

        keypadDist[7][2] = 3;
        keypadDist[7][5] = 2;
        keypadDist[7][8] = 1;
        keypadDist[7][0] = 2;

        keypadDist[2][1] = 1;
        keypadDist[5][1] = 2;
        keypadDist[8][1] = 3;
        keypadDist[0][1] = 4;

        keypadDist[2][4] = 2;
        keypadDist[5][4] = 1;
        keypadDist[8][4] = 2;
        keypadDist[0][4] = 3;

        keypadDist[2][7] = 3;
        keypadDist[5][7] = 2;
        keypadDist[8][7] = 1;
        keypadDist[0][7] = 2;

        // 왼손 시작점
        keypadDist[10][2] = 4;
        keypadDist[10][5] = 3;
        keypadDist[10][8] = 2;
        keypadDist[10][0] = 1;

        // 오른손
        keypadDist[3][2] = 1;
        keypadDist[3][5] = 2;
        keypadDist[3][8] = 3;
        keypadDist[3][0] = 4;

        keypadDist[6][2] = 2;
        keypadDist[6][5] = 1;
        keypadDist[6][8] = 2;
        keypadDist[6][0] = 3;

        keypadDist[9][2] = 3;
        keypadDist[9][5] = 2;
        keypadDist[9][8] = 1;
        keypadDist[9][0] = 2;

        keypadDist[2][3] = 1;
        keypadDist[5][3] = 2;
        keypadDist[8][3] = 3;
        keypadDist[0][3] = 4;

        keypadDist[2][6] = 2;
        keypadDist[5][6] = 1;
        keypadDist[8][6] = 2;
        keypadDist[0][6] = 3;

        keypadDist[2][9] = 3;
        keypadDist[5][9] = 2;
        keypadDist[8][9] = 1;
        keypadDist[0][9] = 2;

        // 오른손 시작점
        keypadDist[11][2] = 4;
        keypadDist[11][5] = 3;
        keypadDist[11][8] = 2;
        keypadDist[11][0] = 1;


        // 가운데
        keypadDist[2][2] = 0;
        keypadDist[5][2] = 1;
        keypadDist[8][2] = 2;
        keypadDist[0][2] = 3;

        keypadDist[2][5] = 1;
        keypadDist[5][5] = 0;
        keypadDist[8][5] = 1;
        keypadDist[0][5] = 2;

        keypadDist[2][8] = 2;
        keypadDist[5][8] = 1;
        keypadDist[8][8] = 0;
        keypadDist[0][8] = 1;

        keypadDist[2][0] = 3;
        keypadDist[5][0] = 2;
        keypadDist[8][0] = 1;
        keypadDist[0][0] = 0;

        var left = 10;
        var right = 11;
        var isLeft = false;
        var sb = new StringBuilder();
        for (int number : numbers) {
            switch (number) {
                case 2, 5, 8, 0 -> {
                    var leftDist = keypadDist[left][number];
                    var rightDist = keypadDist[right][number];
                    if (leftDist == rightDist) {
                        isLeft = Objects.equals(hand, "left");
                    } else {
                        isLeft = leftDist < rightDist;
                    }
                }
                case 1, 4, 7 -> isLeft = true;
                case 3, 6, 9 -> isLeft = false;
            }
            if (isLeft) {
                left = number;
                sb.append("L");
            } else {
                right = number;
                sb.append("R");
            }
        }
        return sb.toString();
    }
}
