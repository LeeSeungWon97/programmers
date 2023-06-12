class Solution {
    public String solution(int[] food) {
        String answer = "";
        int num = 1;
        for(int i=1; i<food.length; i++){
           answer += String.valueOf(num).repeat(food[i]/2);
           num++;
        }
        StringBuffer sb = new StringBuffer(answer);
        answer += "0" + sb.reverse();
        return answer;
    }
}