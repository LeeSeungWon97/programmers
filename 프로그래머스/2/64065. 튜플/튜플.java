import java.util.*;

class Solution {
    public int[] solution(String s) {
        String[] strArr = s.replaceAll("[{}]", "").split(",");
        HashMap<String, Integer> map = new HashMap<>();
        for (String string : strArr) {
            map.put(string, map.getOrDefault(string, 0) + 1);
        }
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());
        Collections.sort(entryList, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));
        int[] answer = new int[entryList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = Integer.parseInt(entryList.get(i).getKey());
        }
        return answer;
    }
}