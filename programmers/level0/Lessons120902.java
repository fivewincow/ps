package level0;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/120902
// 문자열 계산하기
public class Lessons120902 {
    public int solution(String my_string) {
        int answer = 0;
        String[] res = my_string.split(" ");
        answer = Integer.parseInt(res[0]);

        for(int i = 1; i < res.length; i++){
            if(i%2!=0){
                if(res[i].equals("+")){
                    answer += Integer.parseInt(res[i+1]);
                } else {
                    answer -= Integer.parseInt(res[i+1]);
                }
            }
        }

        return answer;
    }
}

