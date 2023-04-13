package level0;

import java.util.ArrayList;
import java.util.List;

// https://school.programmers.co.kr/learn/courses/30/lessons/120905
// n의 배수 고르기
public class Lessons120905 {
    public int[] solution(int n, int[] numlist) {
        List<Integer> resultList = new ArrayList();

        for (int i = 0; i < numlist.length; i++) {
            int result = numlist[i] % n;
            System.out.println(result);
            if (result == 0) {
                resultList.add(numlist[i]);
            }
        }

        return resultList.stream().mapToInt(a -> a).toArray();
    }
}
