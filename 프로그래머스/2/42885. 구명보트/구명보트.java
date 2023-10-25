import java.util.Arrays;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int leftIdx = 0;
        int rightIdx = people.length - 1;
        Arrays.sort(people);
        while (leftIdx <= rightIdx) {
            if (people[leftIdx] + people[rightIdx] <= limit) {
                leftIdx++;
            }
            rightIdx--;
            answer++;
        }
        return answer;
    }
}