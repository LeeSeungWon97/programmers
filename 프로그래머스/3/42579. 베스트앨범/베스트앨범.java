import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        ArrayList<Integer> result = new ArrayList<>(); // 결과 리스트

        Map<String, Integer> map = new HashMap<>(); // 장르별 총 재생 횟수
        for (int i = 0; i < genres.length; i++) {
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
        }

        ArrayList<String> genre = new ArrayList<>(); // 장르 종류 저장 리스트
        for (String key : map.keySet()) {
            genre.add(key);
        }
        Collections.sort(genre, (o1, o2) -> map.get(o2) - map.get(o1));

        // 장르에 수록할 많이 재생된 노래 선정
        for (String key : genre) {
            Map<Integer, Integer> list = new HashMap<>();
            for (int i = 0; i < genres.length; i++) {
                if (genres[i].equals(key)) {
                    list.put(i, plays[i]);
                }
            }
            int i = 0;
            while (true) {
                int idx = getMaxValue(list);
                if (i == 2 || idx == -1) {
                    break;
                }
                result.add(idx);
                list.remove(idx);
                i++;
            }
        }
        int[] answer = new int[result.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }

    private int getMaxValue(Map<Integer, Integer> map) {
        if (map.isEmpty()) {
            return -1;
        }
        int maxValue = 0;
        int idx = -1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int temp = entry.getValue();
            if (temp > maxValue) {
                maxValue = temp;
                idx = entry.getKey();
            }
        }
        return idx;
    }
}