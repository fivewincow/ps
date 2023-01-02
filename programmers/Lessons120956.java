import java.util.ArrayList;
import java.util.List;

public class Lessons120956 {

    public int solution(String[] babbling) {
        int count = 0;
        List<String[]> list = new ArrayList<>();
        for (int i = 0; i < babbling.length; i++) {
            // split 정규 표현식 | = or
            String[] temp = babbling[i].split("aya|ye|woo|ma");
            list.add(temp);
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length == 0) {
                count++;
            }
        }
        return count;
    }
}
