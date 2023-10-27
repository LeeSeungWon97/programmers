import java.util.HashSet;

class Solution {
    public int solution(int[] elements) {
        int len = elements.length;
        HashSet<Integer> sumList = new HashSet<>();
        for (int i = 0; i < len; i++) {
            int sum = 0;
            for (int j = 0; j < len; j++) {
                sum += elements[(i + j) % len];
                sumList.add(sum);
            }
        }
        return sumList.size();
    }
}