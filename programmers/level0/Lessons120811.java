package level0;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/120811
// 중앙값 구하기
public class Lessons120811 {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        return array[array.length / 2];
    }
}
