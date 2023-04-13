package level1;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

// https://school.programmers.co.kr/learn/courses/30/lessons/178871
// 달리기 경주
public class Lessons178871 {
    private static Map<String, Integer> playerInfo = new HashMap<>();

    public String[] solution(String[] players, String[] callings) {
        makeInfo(players);

        for (String calling : callings) {
            int index = playerInfo.get(calling);
            String frontPlayerName = players[index - 1];
            players[index] = frontPlayerName;
            players[index - 1] = calling;

            playerInfo.put(frontPlayerName, index);
            playerInfo.put(calling, index - 1);
        }

        return players;
    }

    private static void makeInfo(String[] players) {
        IntStream.range(0, players.length).forEach(i -> {
            playerInfo.put(players[i], i);
        });
    }

}
