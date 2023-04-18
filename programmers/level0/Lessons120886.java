package level0;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/120886
// A로 B 만들기
public class Lessons120886 {
    public int solution(String before, String after) {
        int answer = 0;

        char[] beforeArray = before.toCharArray();
        char[] afterArray = after.toCharArray();

        Arrays.sort(beforeArray);
        Arrays.sort(afterArray);

        String beforeString = new String(beforeArray);
        String afterString = new String(afterArray);

        if (beforeString.equals(afterString)) {
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }
}

