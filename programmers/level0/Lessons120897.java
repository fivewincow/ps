package level0;

import java.util.ArrayList;
import java.util.List;

// https://school.programmers.co.kr/learn/courses/30/lessons/120897
// 약수 구하기
public class Lessons120897 {
    public int[] solution(int n) {
        List<Integer> divisorList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisorList.add(i);
            }
        }
        int[] answer = divisorList.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
