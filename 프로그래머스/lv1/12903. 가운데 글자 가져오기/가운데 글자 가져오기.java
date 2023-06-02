class Solution {
    public String solution(String s) {
        String answer = "";
        int len = s.length();
        answer += s.charAt(len/2);
        if(len % 2 == 0){
            answer = s.charAt((len/2)-1) + answer;
        }
        return answer;
    }
}