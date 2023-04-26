package level0;

// https://school.programmers.co.kr/learn/courses/30/lessons/120817
// 배열의 평균값
public class Lessons120817 {
    public double solution(int[] numbers) {
        double answer = 0;
        for (int i = 0; i < numbers.length; i++) {
            answer += numbers[i];
        }
        return answer / numbers.length;
    }
}
