package level0;

// https://school.programmers.co.kr/learn/courses/30/lessons/120891
// 369게임
public class Lessons120891 {
    public int solution(int order) {
        int answer = 0;
        char[] chars = String.valueOf(order).toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '3' || chars[i] == '6' || chars[i] == '9') {
                answer++;
            }
        }
        return answer;
    }
}
