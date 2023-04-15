package level0;

// https://school.programmers.co.kr/learn/courses/30/lessons/120895
// 인덱스 바꾸기
public class Lessons120895 {
    public String solution(String my_string, int num1, int num2) {
        char[] chars = my_string.toCharArray();
        chars[num1] = my_string.charAt(num2);
        chars[num2] = my_string.charAt(num1);

        return new String(chars);
    }
}
