package level0;

// https://school.programmers.co.kr/learn/courses/30/lessons/120904
// 숫자 찾기
public class Lessons120904 {
    public int solution(int num, int k) {
        String convertNum = String.valueOf(num);
        int position = convertNum.indexOf(String.valueOf(k));

        return position > -1 ? position + 1 : -1;
    }
}
