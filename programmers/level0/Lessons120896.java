package level0;


// https://school.programmers.co.kr/learn/courses/30/lessons/120896
// 한 번만 등장한 문자
public class Lessons120896 {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        char[] alphabet = new char[26];
        for (int i = 0; i < s.length(); i++) {
            alphabet[s.charAt(i) - 97]++;
        }

        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] == 1) sb.append((char) (i + 97));
        }
        return sb.toString();
    }
}
