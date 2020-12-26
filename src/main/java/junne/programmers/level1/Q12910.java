package junne.programmers.level1;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 나누어 떨어지는 숫자 배열
 * https://programmers.co.kr/learn/courses/30/lessons/12910
 */
public class Q12910 {
    public int[] solution(int[] arr, int divisor) {
        var answer = new ArrayList<Integer>();

        for (int i : arr) {
            if (i % divisor == 0) {
                answer.add(i);
            }
        }

        Collections.sort(answer);

        if (answer.size() == 0) {
            answer.add(-1);
        }

        return answer.stream().mapToInt(x -> x).toArray();
    }
}
