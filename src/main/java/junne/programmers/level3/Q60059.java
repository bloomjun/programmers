package junne.programmers.level3;

/**
 * [2020카카오공채] 자물쇠와 열쇠
 * https://programmers.co.kr/learn/courses/30/lessons/60059
 */
public class Q60059 {
    public boolean solution(int[][] key, int[][] lock) {
        int m = key.length;
        int n = lock.length;
        int r = 2 * m + n - 2;

        int[][] map = new int[r][r];
        for (int i = (m - 1); i < (m + n - 1); i++) {
            int j = (m - 1);
            while (j < (m + n - 1)) {
                map[i][j] = lock[i - (m - 1)][j - (m - 1)]; // lock 대입
                j++;
            }
        }

        if (isOpen(map, m, n)) {
            return true;
        }

        int rotate = 0;
        while (rotate < 4) {
            for (int i = 0; i < m + n - 1; i++) {
                for (int j = 0; j < m + n - 1; j++) {
                    for (int k = 0; k < m; k++) {
                        for (int l = 0; l < m; l++) {
                            // lock + key 값을 map 에 저장
                            // map 의 lock 영역이 모두 1 이면 자물쇠 오픈
                            map[i + k][j + l] += key[k][l];
                        }
                    }

                    boolean open = isOpen(map, m, n);
                    if (open) {
                        return true;
                    }

                    // 자물쇠를 못 열었다면, 이전에 작업 롤백
                    for (int k = 0; k < m; k++) {
                        for (int l = 0; l < m; l++) {
                            map[i + k][j + l] -= key[k][l];
                        }
                    }
                }
            }

            // 90 도 회전
            int[][] rotateKey = new int[m][m];
            for (int i = 0; i < m; ++i) {
                for (int j = 0; j < m; j++) {
                    rotateKey[i][j] = key[j][m - 1 - i];
                }
            }
            key = rotateKey;
            rotate++;
        }
        return false;
    }

    // 자물쇠가 열렸는지 확인
    private boolean isOpen(int[][] map, int m, int n) {
        for (int i = (m - 1); i < (m + n - 1); i++) {
            for (int j = (m - 1); j < (m + n - 1); j++) {
                if (map[i][j] != 1) {
                    return false;
                }
            }
        }
        return true;
    }
}
