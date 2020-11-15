package junne.programmers.level1;

import java.util.TreeSet;

/**
 * 두 개 뽑아서 더하기
 * https://programmers.co.kr/learn/courses/30/lessons/68644?language=java
 */
public class Q68644 {

    public int[] solution(int[] numbers) {
        var answer = new TreeSet<Integer>();
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                answer.add(numbers[i] + numbers[j]);
            }
        }
        return answer.stream().mapToInt(x -> x).toArray();
    }
}
