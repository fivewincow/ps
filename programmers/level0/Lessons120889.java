package level0;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/120889
// 삼각형의 완성조건(1)
public class Lessons120889 {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        int answer = 0;
        if (sides[2] < sides[0] + sides[1]) {
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }
}
