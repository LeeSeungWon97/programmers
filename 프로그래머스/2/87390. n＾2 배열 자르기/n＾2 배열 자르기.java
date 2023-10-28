import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Long> solution(int n, long left, long right) {
        ArrayList<Long> arrList = new ArrayList<>();
        for (long i = left; i < right + 1; i++) {
            arrList.add(Math.max(i / n, i % n) + 1);
        }
        return arrList;
    }
}