package junne.programmers.level2;

/**
 * 타겟 넘버
 * https://programmers.co.kr/learn/courses/30/lessons/43165
 */
public class Q43165 {
    static int ANSWER = 0;

    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0);
        return ANSWER;
    }

    public void dfs(int[] numbers, int target, int step) {
        if (step == numbers.length) {
            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            if (sum == target) {
                ANSWER++;
            }
        } else {
            numbers[step] *= 1;
            dfs(numbers, target, step + 1);

            numbers[step] *= -1;
            dfs(numbers, target, step + 1);
        }
    }
}
