package junne.programmers.level1;

import java.util.ArrayList;
import java.util.List;

/**
 * 3진법 뒤집기
 * https://programmers.co.kr/learn/courses/30/lessons/68935
 */
public class Q68935 {
    public int solution(int n) {
        List<Integer> list = new ArrayList<>();
        while (n > 0) {
            var remainder = n % 3;
            list.add(remainder); // 순서대로 저장
            n = n / 3;
        }

        if (n != 0) {
            list.add(n);
        }

        int sum = 0;
        int digit = 0;
        for (int i = list.size() - 1; i >= 0; i--) { // 앞뒤 반전
            sum += list.get(i) * Math.pow(3, digit++);
        }
        return sum;
    }
}
