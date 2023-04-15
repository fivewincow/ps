package level0;

// https://school.programmers.co.kr/learn/courses/30/lessons/120899
// 가장 큰 수 찾기
public class Lessons120899 {
    public static int[] solution(int[] array) {
        int[] answer = new int[2];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                answer[0] = array[i + 1];
                answer[1] = i + 1;
            }
        }
        return answer;
    }
}
