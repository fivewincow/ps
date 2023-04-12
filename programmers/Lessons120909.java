// https://school.programmers.co.kr/learn/courses/30/lessons/120909
// 제곱수 판별하기
public class Lessons120909 {
    public int solution(int n) {
        double sqrt = Math.sqrt(n);
        if(sqrt % 1 == 0.0) {
            return 1;
        } else {
            return 2;
        }
    }
}
