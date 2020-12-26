package junne.programmers.level1;

/**
 * 두 정수 사이의 합
 * https://programmers.co.kr/learn/courses/30/lessons/12912
 */
public class Q12912 {
    public long solution(int a, int b) {
        long answer = 0;
        var start = Math.min(a, b);
        var end = Math.max(a, b);
        for (int i = start; i <= end; i++) {
            answer += i;
        }
        return answer;
    }
}
