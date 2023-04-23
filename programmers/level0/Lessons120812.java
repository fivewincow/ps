package level0;

// https://school.programmers.co.kr/learn/courses/30/lessons/120812
// 최빈값 구하기
public class Lessons120812 {
    public int solution(int[] array) {
        int answer = array[0];
        int[] tempArray = new int[1000];
        int max = 0;
        int maxIndex = 0;
        int duplicateValue = 0;
        for (int i = 0; i < array.length; i++) {
            tempArray[array[i]]++;

            if (max < tempArray[array[i]]) {
                max = tempArray[array[i]];
                answer = array[i];
            }
        }


        for (int j = 0; j < 1000; j++) {
            if (max == tempArray[j]) duplicateValue++;
            if (duplicateValue > 1) answer = -1;
        }

        return answer;
    }
}
