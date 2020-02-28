package junne.programmers;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * [2019카카오공채] 오픈채팅방
 * https://programmers.co.kr/learn/courses/30/lessons/42888
 */
public class Q42888 {
    private static final String BLANK = " ";
    private static final String COLON = ":";
    private static final String ENTER = "Enter";
    private static final String LEAVE = "Leave";
    private static final String CHANGE = "Change";

    public String[] solution(String[] record) {
        var userMap = new HashMap<String, String>();
        var commands = new ArrayList<String>();

        for (var s : record) {
            var split = s.split(BLANK);
            switch (split[0]) {
                case ENTER:
                    userMap.put(split[1], split[2]);
                    commands.add(String.format("%s:%s", split[0], split[1]));
                    break;
                case LEAVE:
                    commands.add(String.format("%s:%s", split[0], split[1]));
                    break;
                case CHANGE:
                    userMap.put(split[1], split[2]);
                    break;
            }
        }

        return commands.stream()
                .map(s -> {
                    var split = s.split(COLON);
                    var userName = userMap.get(split[1]);

                    if (split[0].equals(ENTER)) {
                        return userName + "님이 들어왔습니다.";
                    } else {
                        return userName + "님이 나갔습니다.";
                    }
                })
                .toArray(String[]::new);
    }
}
