package junne.programmers.level1;

public class Q77484 {
    public int[] solution(int[] lottos, int[] winNums) {
        var zeroCount = 0;
        var matchCount = 0;
        for (int lotto : lottos) {
            if (lotto == 0) {
                zeroCount++;
                continue;
            }
            for (int winNum : winNums) {
                if (lotto == winNum) {
                    matchCount++;
                    break;
                }
            }
        }

        var first = (matchCount + zeroCount) > 0 ? 7 - (matchCount + zeroCount) : 6;
        var last = matchCount > 0 ? 7 - matchCount : 6;
        return new int[]{first, last};
    }
}
