package level0;

// https://school.programmers.co.kr/learn/courses/30/lessons/120888
// 중복된 문자 제거
public class Lessons120888 {
    public String solution(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.indexOf(my_string.charAt(i)) == i) {
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}
