package junne.programmers.level2;

/**
 * [2020카카오공채] 문자열 압축
 * https://programmers.co.kr/learn/courses/30/lessons/60057
 */
public class Q60057 {
    public int solution(String s) {
        int answer = s.length();

        int length = s.length();
        for (int i = 1; i <= length / 2; ++i) { // 문자 자르는 단위(i) 만큼 반복
            int pos = 0;
            int compressionLength = s.length();
            while (pos + i <= length) {
                String origin = s.substring(pos, i + pos);
                pos += i;
                int count = 0;
                while (pos + i <= length) {
                    String target = s.substring(pos, pos + i);
                    if (origin.equals(target)) {
                        count++;
                        pos += i;
                    } else {
                        break;
                    }
                }

                if (count > 0) { // 연속된 문자가 존재한다면
                    compressionLength -= (i * count); // 연속된 문자 길이 제거

                    // 숫자 표현하는 길이 추가
                    if (count < 9) {
                        compressionLength += 1;
                    } else if (count < 99) {
                        compressionLength += 2;
                    } else if (count < 999) {
                        compressionLength += 3;
                    } else {
                        compressionLength += 4;
                    }
                }
            }

            answer = Math.min(answer, compressionLength);
        }

        return answer;
    }
}
