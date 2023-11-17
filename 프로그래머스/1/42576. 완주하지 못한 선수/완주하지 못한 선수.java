import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();
        for (String s : participant) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        for (String s : completion) {
            if (map.containsKey(s)) {
                map.replace(s, map.get(s) - 1);
            }
        }

        for (String s : map.keySet()) {
            if (map.get(s) != 0) {
                System.out.println("s = " + s);
                answer = s;
                break;
            }
        }

        return answer;
    }
}