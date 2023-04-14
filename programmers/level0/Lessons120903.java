package level0;

// https://school.programmers.co.kr/learn/courses/30/lessons/120903
// 배열의 유사도
public class Lessons120903 {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for (int i = 0; i < s2.length; i++) {
            for (int j = 0; j < s1.length; j++) {
                if (s1[j].equals(s2[i])) {
                    answer++;
                }
            }
        }

        return answer;
    }
}
