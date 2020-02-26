package junne.programmers;

import java.util.Stack;

/**
 * [2020카카오공채] 괄호 변환
 * https://programmers.co.kr/learn/courses/30/lessons/60058
 */
public class Q60058 {
    int pos;

    private boolean isCorrect(String w) {
        boolean correct = true;
        int left = 0;
        int right = 0;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < w.length(); i++) {
            char bracket = w.charAt(i);
            if (bracket == '(') {
                left++;
                stack.push(bracket);
            } else {
                right++;
                if (stack.isEmpty()) {
                    correct = false;
                } else {
                    stack.pop();
                }
            }

            if (left == right) {
                pos = i + 1;
                return correct;
            }
        }

        return true;
    }

    public String solution(String p) {
        if (p.isEmpty()) {
            return p;
        }

        boolean correct = isCorrect(p);
        String u = p.substring(0, pos);
        String v = p.substring(pos);

        if (correct) {
            return u + solution(v);
        }

        StringBuilder answer = new StringBuilder("(" + solution(v) + ")");

        for (int i = 1; i < u.length() - 1; i++) {
            if (u.charAt(i) == '(') {
                answer.append(")");
            } else {
                answer.append("(");
            }
        }

        return answer.toString();
    }
}
