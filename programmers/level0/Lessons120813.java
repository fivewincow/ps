package level0;

import java.util.ArrayList;
import java.util.List;

// https://school.programmers.co.kr/learn/courses/30/lessons/120813
// 짝수는 싫어요
public class Lessons120813 {
    public int[] solution(int n) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) integerList.add(i);
        }

        int[] answer = integerList.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }

}