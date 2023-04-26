package level0;

// https://school.programmers.co.kr/learn/courses/30/lessons/120818
// 옷가게 할인 받기
public class Lessons120818 {
    public int solution(int price) {
        int answer = 0;
        if (price >= 500000) {
            answer = (int) (price - price * 0.2);
        } else if (price >= 300000) {
            answer = (int) (price - price * 0.1);
        } else if (price >= 100000) {
            answer = (int) (price - price * 0.05);
        } else {
            answer = price;
        }
        return answer;
    }
}
