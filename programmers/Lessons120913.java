import java.util.ArrayList;
import java.util.List;

// https://school.programmers.co.kr/learn/courses/30/lessons/120913
// 잘라서 배열로 저장하기
public class Lessons120913 {
    public String[] solution(String my_str, int n) {
        List<String> stringList = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < my_str.length(); i += n) {
            count = i + n;

            if (count > my_str.length()) {
                stringList.add(my_str.substring(count - n));
                return stringList.toArray(new String[stringList.size()]);
            }
            String subStringMessage = my_str.substring(i, count);
            stringList.add(subStringMessage);
        }
        return stringList.toArray(new String[stringList.size()]);
    }

}
