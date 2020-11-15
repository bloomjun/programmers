package junne.programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 모의고사
 * https://programmers.co.kr/learn/courses/30/lessons/42840
 */
public class Q42840 {
    public int[] solution(int[] answers) {
        int[][] memberAnswer = {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };
        int[] memberAnswerCount = {0, 0, 0};

        for (int i = 0; i < answers.length; i++) {
            for (int j = 0; j < 3; j++) {
                if (memberAnswer[j][i % memberAnswer[j].length] == answers[i]) {
                    memberAnswerCount[j]++;
                }
            }
        }

        int max = Arrays.stream(memberAnswerCount).boxed().max(Integer::compareTo).orElse(-1);

        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < memberAnswerCount.length; i++) {
            if (memberAnswerCount[i] == max) {
                answer.add(i + 1);
            }
        }

        return answer.stream().mapToInt(x -> x).toArray();
    }

}
