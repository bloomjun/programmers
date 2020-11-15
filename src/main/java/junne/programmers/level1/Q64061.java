package junne.programmers.level1;

import java.util.Stack;

/**
 * 크레인 인형뽑기 게임
 * https://programmers.co.kr/learn/courses/30/lessons/64061
 */
public class Q64061 {

    public int solution(int[][] board, int[] moves) {
        var answer = 0;
        var stack = new Stack<Integer>();
        for (int move : moves) {
            var selected = 0;
            var index = move - 1;
            for (int i = 0; i < board[index].length; i++) {
                if (board[i][index] != 0) {
                    selected = board[i][index];
                    board[i][index] = 0;
                    break;
                }
            }

            if (selected != 0) {
                if (stack.empty()) {
                    stack.push(selected);
                } else {
                    var peek = stack.peek();
                    if (selected == peek) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(selected);
                    }
                }
            }
        }
        return answer;
    }
}
