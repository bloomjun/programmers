package junne.programmers.level1;

/**
 * 가운데 글자 가져오기
 * https://programmers.co.kr/learn/courses/30/lessons/12903
 */
public class Q12903 {
    public String solution(String s) {
        var length = s.length();
        var middle = length / 2;

        if (length % 2 == 0) {
            return s.substring(middle - 1, middle + 1);
        } else {
            return s.substring(middle, middle + 1);
        }
    }
}
