import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        int n = 0;
        for(int i = 0; i<arr.length;i++){
            if(arr[i]%divisor==0){
                n++;
            }
        }
        if(n==0){
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }
        answer = new int[n];
        int idx = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]%divisor == 0){
                answer[idx] = arr[i];
                idx++;
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}