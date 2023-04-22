package level0;

// https://school.programmers.co.kr/learn/courses/30/lessons/120809
// 배열 두 배 만들기
public class Lessons120809 {
    public int[] solution(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 2;
        }
        return numbers;
    }
}
