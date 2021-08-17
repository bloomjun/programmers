package junne.programmers.level1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Q1845 {

    public int solution(int[] nums) {
        var number = nums.length / 2;
        var hashSet = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        return Math.min(hashSet.size(), number);
    }
}
