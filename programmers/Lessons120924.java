// 다음에 올 숫자
// https://school.programmers.co.kr/learn/courses/30/lessons/120924
public class Lessons120924 {

    public static int solution(int[] common) {
        int i = 0;
        int answer = 0;

        if (common[2] - common[1] != common[1] - common[0]) {
            i = common[2] / common[1];
            answer = common[common.length - 1] * i;
            return answer;
        } else {
            i = common[2] - common[1];
            answer = common[common.length - 1] + i;
            return answer;
        }
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 4, 8}));
    }

}
