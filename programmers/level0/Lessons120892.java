package level0;

// https://school.programmers.co.kr/learn/courses/30/lessons/120892
// 암호 해독
public class Lessons120892 {
    public String solution(String cipher, int code) {
        char[] chars = cipher.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = code - 1; i < chars.length; i += code) {
            sb.append(chars[i]);
        }
        return sb.toString();
    }
}
