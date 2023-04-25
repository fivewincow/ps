package level0;


// https://school.programmers.co.kr/learn/courses/30/lessons/120815
// 피자 나눠 먹기(2)
public class Lessons120815 {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= 6 * n; i++) {
            if (6 * i % n == 0) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}
