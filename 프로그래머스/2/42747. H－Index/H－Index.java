import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        int total = citations.length;
        Arrays.sort(citations);
        int answer = 0;
        for (int i = 0; i < total; i++) {
            int compare = i + 1;
            int upperCnt = 0;
            int lowerCnt = 0;
            for (int j = 0; j < total; j++) {
                if (citations[j] >= compare) {
                    upperCnt++;
                } else {
                    lowerCnt++;
                }
            }
            if (upperCnt >= compare && lowerCnt < compare) {
                answer = compare;
            }
        }
        return answer;
    }
}