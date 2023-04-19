package level0;

// https://school.programmers.co.kr/learn/courses/30/lessons/120849
// 모음 제거
public class Lessons120849 {
    public String solution(String my_string) {
        String answer = "";
        answer = my_string.replaceAll("[aeiou]", "");

        return answer;
    }
}
