import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean solution(String[] phone_book) {
        Map<String, Integer> map = new HashMap();
        for (String phone_num : phone_book) {
            map.put(phone_num, 1);
        }
        for (String phone_num : phone_book) {
            for (int i = 1; i < phone_num.length(); i++) {
                String prefix = phone_num.substring(0, i);
                if (map.containsKey(prefix)) {
                    return false;
                }
            }
        }
        return true;
    }
}