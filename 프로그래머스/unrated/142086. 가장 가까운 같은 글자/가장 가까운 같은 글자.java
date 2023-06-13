class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        for(int i=0; i<s.length(); i++){
            String str = s.substring(0,i);
            int idx = str.lastIndexOf(s.charAt(i));
            if(idx != -1){
                answer[i] = i - idx;
            } else {
                answer[i] = -1;
            }
        }
        return answer;
    }
}