package junne.programmers;

import java.util.*;

/**
 * 완주하지 못한 선수
 * https://programmers.co.kr/learn/courses/30/lessons/42576
 */
public class Q42576 {

    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : participant) {
            map.merge(s, 1, Integer::sum);
        }

        for (String s : completion) {
            Integer count = map.get(s);
            map.put(s, count - 1);
        }

        return map.entrySet().stream()
                .filter(entry -> entry.getValue() > 0)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse("");
    }
}
