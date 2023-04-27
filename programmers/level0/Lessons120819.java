package level0;

// https://school.programmers.co.kr/learn/courses/30/lessons/120819
// 아이스 아메리카노
public class Lessons120819 {
    public int[] solution(int money) {
        int[] answer = new int[2];
        answer[0] = money / 5500;
        answer[1] = Math.abs((answer[0] * 5500) - money);
        return answer;
    }
}
