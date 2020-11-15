package junne.programmers.level2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 전화번호 목록
 * https://programmers.co.kr/learn/courses/30/lessons/42577
 */
public class Q42577 {

    public boolean solution(String[] phone_book) {
        // 입력 값을 Set 으로 집어 넣는다.
        Set<String> set = new HashSet<>(List.of(phone_book));

        for (String number : phone_book) {
            for (String prefix : set) {
                if (number.startsWith(prefix) && !number.equals(prefix)) { // 접두어 확인
                    return false;
                }
            }
        }
        return true;
    }
}
