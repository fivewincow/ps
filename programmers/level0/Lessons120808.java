package level0;

// https://school.programmers.co.kr/learn/courses/30/lessons/120808
// 분수의 덧셈
public class Lessons120808 {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int topNumber = (numer1 * denom2) + (numer2 * denom1);

        int bottomNumber = denom1 * denom2;

        int maximum = 1;

        for (int i = topNumber - 1; i > 1; i--) {
            if (topNumber % i == 0 && bottomNumber % i == 0) {
                topNumber /= i;
                bottomNumber /= i;
            }
        }
        return new int[]{topNumber, bottomNumber};
    }
}
