package level0;

// https://school.programmers.co.kr/learn/courses/30/lessons/120893
// 대문자와 소문자
public class Lessons120893 {
    public String solution(String my_string) {
        char[] chars = my_string.toCharArray();
        for (int i = 0; i < my_string.length(); i++) {
            if (chars[i] < 97) {
                chars[i] = String.valueOf(chars[i]).toLowerCase().charAt(0);
            } else {
                chars[i] = String.valueOf(chars[i]).toUpperCase().charAt(0);
            }
        }
        return String.valueOf(chars);
    }
}
