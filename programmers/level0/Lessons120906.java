package level0;

// https://school.programmers.co.kr/learn/courses/30/lessons/120906
// 자릿수 더하기
public class Lessons120906 {
    public int solution(int n) {
        int answer = 0;
        String target = Integer.toString(n);
        for (int i = 0; i < target.length(); i++) {
            answer += Integer.parseInt(String.valueOf(target.charAt(i)));
        }
        return answer;
    }
}
