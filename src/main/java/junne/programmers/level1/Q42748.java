package junne.programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * K번째수
 * https://programmers.co.kr/learn/courses/30/lessons/42748
 */
public class Q42748 {

    public int[] solution(int[] array, int[][] commands) {
        List<Integer> answer = new ArrayList<>();
        for (int[] command : commands) {
            var i = command[0] - 1;
            var j = command[1];
            var k = command[2] - 1;
            var subArray = Arrays.copyOfRange(array, i, j);
            Arrays.sort(subArray);
            answer.add(subArray[k]);
        }
        return answer.stream().mapToInt(x -> x).toArray();
    }
}
