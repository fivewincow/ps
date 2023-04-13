package level0;

// 문자열 밀기
// https://school.programmers.co.kr/learn/courses/30/lessons/120921
public class Lessons120921 {
    public int solution(String A, String B) {
        int answer = (B + B).indexOf(A);
        return answer;
    }

    // indexOf(String str)
    // 특정 문자나 문자열이 앞에서 부터 처음 발견되는 인덱스를 반환 없으면 -1 반환
}
