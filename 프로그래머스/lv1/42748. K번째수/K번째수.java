import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int len = commands.length;
        int[] answer = new int[len];
        for(int i=0; i<len; i++){
            int arrLen = commands[i][1]-commands[i][0]+1;
            int[] arr = new int[arrLen];
            for(int j=0; j<arrLen; j++){
                arr[j] = array[commands[i][0]-1+j];
            }
            Arrays.sort(arr);
            answer[i] = arr[commands[i][2]-1];
        }
        return answer;
    }
}