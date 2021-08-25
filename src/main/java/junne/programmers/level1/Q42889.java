package junne.programmers.level1;

import java.util.HashMap;
import java.util.Map;

public class Q42889 {
    public int[] solution(int N, int[] stages) {
        var numOfStages = new int[N + 2];
        var failRateMap = new HashMap<Integer, Double>();

        for (int stage : stages) {
            numOfStages[stage]++;
        }

        var numOfUser = stages.length;
        for (int i = 1; i < numOfStages.length - 1; i++) {
            if (numOfUser == 0) {
                failRateMap.put(i, 0.0);
            } else {
                var rate = numOfStages[i] / (double) numOfUser;
                failRateMap.put(i, rate);
                numOfUser -= numOfStages[i];
            }
        }

        return failRateMap.entrySet().stream().sorted(((o1, o2) -> {
                    if (o1.getValue().equals(o2.getValue())) {
                        return o1.getKey() - o2.getKey();
                    } else {
                        return o2.getValue() < o1.getValue() ? -1 : 1;
                    }
                }))
                .mapToInt(Map.Entry::getKey)
                .toArray();
    }
}
