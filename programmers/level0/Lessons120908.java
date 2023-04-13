package level0;

// https://school.programmers.co.kr/learn/courses/30/lessons/120908
// 문자열안에 문자열
public class Lessons120908 {

    public int solution(String str1, String str2) {
        int check = str1.indexOf(str2);
        int answer = check > -1 ? 1 : 2;
        return answer;
    }
}
