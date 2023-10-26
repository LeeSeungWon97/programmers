import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

class Solution {
    public int solution(int k, int[] tangerine) {
        int kind = 0;
        int count = 0;
        HashMap<Integer, Integer> sizeCount = new HashMap<>();
        for (int i : tangerine) {
            sizeCount.put(i, sizeCount.getOrDefault(i, 0) + 1);
        }
        List<Integer> values = new ArrayList<>(sizeCount.values());
        Collections.sort(values, Collections.reverseOrder());
        for (Integer value : values) {
            kind++; count += value;
            if (count >= k) {
                break;
            }
        }
        return kind;
    }
}