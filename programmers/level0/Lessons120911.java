package level0;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/120911
// 문자열 정렬하기(2)
public class Lessons120911 {
    public String solution(String my_string) {
        String lowerCase = my_string.toLowerCase();

        char[] tempCharArray = lowerCase.toCharArray();
        Arrays.sort(tempCharArray);

        String answer = new String(tempCharArray);
        return answer;
    }
}
