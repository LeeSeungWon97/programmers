import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<Integer> solution(String msg) {
        HashMap<String, Integer> dictionary = new HashMap<>();
        initMap(dictionary);
        ArrayList<Integer> list = new ArrayList<>();
        String current = "";
        for (char c : msg.toCharArray()) {
            String combined = current + c;
            if (dictionary.containsKey(combined)) {
                current = combined;
            } else {
                list.add(dictionary.get(current));
                dictionary.put(combined, dictionary.size() + 1);
                current = String.valueOf(c);
            }
        }
        if (!current.equals("")) {
            list.add(dictionary.get(current));
        }
        return list;
    }

    private void initMap(HashMap<String, Integer> map) {
        int i = 1;
        char alpha = 'A';
        while (i <= 26) {
            map.put(alpha + "", i);
            i++;
            alpha++;
        }
    }
}
