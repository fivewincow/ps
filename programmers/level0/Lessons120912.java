package level0;

// https://school.programmers.co.kr/learn/courses/30/lessons/120912
// 7의 개수
public class Lessons120912 {

    public int solution(int[] array) {
        int answer = 0;

        for (int i = 0; i < array.length; i++) {
            String target = String.valueOf(array[i]);
            answer += target.length() - target.replace("7", "").length();
        }
        return answer;
    }
}
