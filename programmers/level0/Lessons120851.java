package level0;

// https://school.programmers.co.kr/learn/courses/30/lessons/120851
// 숨어있는 숫자의 덧셈(1)
public class Lessons120851 {
    public int solution(String my_string) {
        int answer = 0;
        String replaceAll = my_string.toLowerCase().replaceAll("[a-z]", "");
        String[] split = replaceAll.split("");
        for (int i = 0; i < split.length; i++) {
            answer += Integer.parseInt(split[i]);
        }
        return answer;
    }
}
