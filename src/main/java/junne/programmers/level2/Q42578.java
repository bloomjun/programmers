package junne.programmers.level2;

import java.util.*;

/**
 * 위장
 * https://programmers.co.kr/learn/courses/30/lessons/42578
 */
public class Q42578 {

    public int solution(String[][] clothes) {
        var map = new HashMap<String, List<String>>();
        for (String[] clothe : clothes) {
            List<String> list = map.get(clothe[1]);
            if (list == null) {
                list = new ArrayList<>(List.of(clothe[0]));
                map.put(clothe[1], list);
            } else {
                list.add(clothe[0]);
            }
        }

        // 종류가 A, B, C 일 때: A + B + C + AB + AC + BC + ABC = (A+1)(B+1)(C+1) - 1
        int answer = 1;
        for (List<String> list : map.values()) {
            answer *= (list.size() + 1);
        }
        return answer - 1;
    }
}
