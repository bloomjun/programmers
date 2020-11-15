package junne.programmers.level1;

import java.util.Arrays;

/**
 * 체육복
 * https://programmers.co.kr/learn/courses/30/lessons/42862
 * 유형: 탐욕법
 */
public class Q42862 {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] gymSuit = new int[n];
        Arrays.fill(gymSuit, 1);

        for (int i : lost) {
            gymSuit[i - 1]--;
        }

        for (int i : reserve) {
            gymSuit[i - 1]++;
        }

        for (int i : reserve) {
            int index = i - 1;
            if (index - 1 >= 0 && gymSuit[index] > 1) {
                if (gymSuit[index - 1] < 1) {
                    gymSuit[index]--;
                    gymSuit[index - 1]++;
                }
            }
            if (index + 1 < n && gymSuit[index] > 1) {
                if (gymSuit[index + 1] < 1) {
                    gymSuit[index]--;
                    gymSuit[index + 1]++;
                }
            }
        }

        int answer = 0;
        for (int i : gymSuit) {
            if (i > 0) {
                answer++;
            }
        }

        return answer;
    }
}
