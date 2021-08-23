package junne.programmers.level1;

public class Q83201 {
    public String solution(int[][] scores) {
        var answer = new StringBuilder();

        for (int i = 0; i < scores.length; i++) {
            var max = 0;
            var maxCount = 0;
            var min = 100;
            var minCount = 0;

            var sum = 0;
            for (int j = 0; j < scores[i].length; j++) {
                sum += scores[j][i];

                if (max < scores[j][i]) {
                    max = scores[j][i];
                    maxCount = 0;
                }

                if (max == scores[j][i]) {
                    maxCount++;
                }

                if (min > scores[j][i]) {
                    min = scores[j][i];
                    minCount = 0;
                }

                if (min == scores[j][i]) {
                    minCount++;
                }
            }

            var avg = 0.0;
            if ((maxCount == 1 && scores[i][i] == max) || minCount == 1 && scores[i][i] == min) {
                sum -= scores[i][i];
                avg = sum / (double) (scores[i].length - 1);
            } else {
                avg = sum / (double) scores[i].length;
            }

            if (avg >= 90) {
                answer.append("A");
            } else if (avg < 90 && avg >= 80) {
                answer.append("B");
            } else if (avg < 80 && avg >= 70) {
                answer.append("C");
            } else if (avg < 70 && avg >= 50) {
                answer.append("D");
            } else {
                answer.append("F");
            }
        }
        return answer.toString();
    }
}
