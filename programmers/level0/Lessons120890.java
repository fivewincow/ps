package level0;

import java.util.Arrays;
import java.util.stream.Collectors;

// https://school.programmers.co.kr/learn/courses/30/lessons/120890
// 가까운 수
public class Lessons120890 {
    public int solution(int[] array, int n) {
        int answer = 0;
        int[] tempArray = new int[array.length];
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            tempArray[i] = Math.abs(array[i] - n);
        }
        int asInt = Arrays.stream(tempArray).min().getAsInt();
        int target = Arrays.stream(tempArray)
                .boxed()
                .collect(Collectors.toList())
                .indexOf(asInt);
        return array[target];
    }
}
