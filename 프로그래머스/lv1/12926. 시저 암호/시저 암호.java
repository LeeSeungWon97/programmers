class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            if(ch>=65 && ch<=90){
                if(ch+n > 90){
                    ch = (char) (65 + (ch+n-91));
                } else {
                    ch += n;
                }
            }else if(ch>=97 && ch <= 122){
                if(ch+n > 122){
                    ch = (char) (97 + (ch+n-123));
                }else{
                    ch += n;
                }
            }
            answer += ch;
        }
        return answer;
    }
}