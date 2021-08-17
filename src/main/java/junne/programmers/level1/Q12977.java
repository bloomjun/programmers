package junne.programmers.level1;

import java.util.Arrays;

public class Q12977 {

    public int solution(int[] nums) {
        var answer = 0;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    var sum = nums[i] + nums[j] + nums[k];
                    var isPrime = true;
                    for (int l = 2; l < sum; l++) {
                        if (sum % l == 0) {
                            isPrime = false;
                            break;
                        }
                    }

                    if (isPrime) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
}
