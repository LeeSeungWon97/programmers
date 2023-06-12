import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> sums = new ArrayList<Integer>();
        for(int i=0; i<numbers.length;i++){
            for(int j=1; j<numbers.length;j++){
                if(i==j){
                    continue;
                }
                int sum = numbers[i]+numbers[j];
                if(!sums.contains(sum)){
                    sums.add(sum);
                }
            }
        }
        int[] answer = new int[sums.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = sums.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}