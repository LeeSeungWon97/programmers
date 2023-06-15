import java.util.Arrays;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        int boxCnt = score.length/m;
        for(int i=score.length-boxCnt*m; i<score.length; i += m){
            int p = score[i];
            answer += p * m;
        }
        return answer;
    }
}