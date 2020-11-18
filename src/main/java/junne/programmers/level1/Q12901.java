package junne.programmers.level1;

import java.time.LocalDate;

/**
 * 2016년
 * https://programmers.co.kr/learn/courses/30/lessons/12901
 */
public class Q12901 {
    String[] days = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};

    public String solution(int a, int b) {
        var date = LocalDate.of(2016, a, b);
        var intDay = date.getDayOfWeek().getValue();// from 1 (Monday) to 7 (Sunday)
        return days[intDay - 1];
    }
}
