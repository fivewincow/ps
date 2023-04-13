package level0;

// https://school.programmers.co.kr/learn/courses/30/lessons/120907
// OX퀴즈
public class Lessons120907 {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        String[] splitAnswer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {
            splitAnswer = quiz[i].split(" ");

            if (splitAnswer[1].equals("+")) {
                if (Integer.parseInt(splitAnswer[0]) + Integer.parseInt(splitAnswer[2]) == Integer.parseInt(splitAnswer[4])) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            } else {
                if (Integer.parseInt(splitAnswer[0]) - Integer.parseInt(splitAnswer[2]) == Integer.parseInt(splitAnswer[4])) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
        }
        return answer;
    }
}
