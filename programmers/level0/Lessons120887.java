package level0;

// https://school.programmers.co.kr/learn/courses/30/lessons/120887
// k의 개수
public class Lessons120887 {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for (int target = i; target <= j; target++) {
            StringBuilder sb = new StringBuilder();
            sb.append(target);

            int defaultLength = sb.length();

            for (int r = 0; r < defaultLength; r++) {
                if ((sb.charAt(r) - '0') == k) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
