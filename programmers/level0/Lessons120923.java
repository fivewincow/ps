package level0;

// 연속된 수의 합
// https://school.programmers.co.kr/learn/courses/30/lessons/120923
public class Lessons120923 {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];

        int middle = total / num;
        int minus = total % num == 0 ? num / 2 : num / 2 - 1;

        int startNumber = middle - minus;

        for (int i = 0; i < num; i++) {
            answer[i] = startNumber + i;
        }
        return answer;
    }
}