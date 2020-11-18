package junne.programmers.level1;

import java.util.Stack;

/**
 * 같은 숫자는 싫어
 * https://programmers.co.kr/learn/courses/30/lessons/12906
 */
public class Q12906 {
    public int[] solution(int[] arr) {
        var stack = new Stack<Integer>();
        for (int i : arr) {
            if (stack.isEmpty()) {
                stack.add(i);
            } else {
                var peek = stack.peek();
                if (peek != i) {
                    stack.add(i);
                }
            }
        }
        return stack.stream().mapToInt(x -> x).toArray();
    }
}
