import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int cnt = 0;
        int zeroCnt = 0;
        Arrays.sort(lottos);
        Arrays.sort(win_nums);
        for(int i=0; i<lottos.length; i++){
            if(Arrays.binarySearch(lottos,win_nums[i]) >= 0) {
                cnt++;
            }
            if(lottos[i]==0){
                zeroCnt++;
            }
        }
        answer[0] = getRank(cnt+zeroCnt);
        answer[1] = getRank(cnt);
        return answer;
    }

    int getRank(int correctAnswer){
        if(correctAnswer == 0 || correctAnswer == 1){
            return 6;
        } else {
            return 6-correctAnswer+1;
        }
    }
}