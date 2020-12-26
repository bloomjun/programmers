package junne.programmers.level1;

/**
 * 문자열 내 p와 y의 개수
 * https://programmers.co.kr/learn/courses/30/lessons/12916
 */
public class Q12916 {
    boolean solution(String s) {
        var string = s.toLowerCase();
        int p = 0;
        int y = 0;
        for (int i = 0; i < string.length(); i++) {
            switch (string.charAt(i)) {
                case 'p' -> p++;
                case 'y' -> y++;
            }
        }
        return p == y;
    }
}
