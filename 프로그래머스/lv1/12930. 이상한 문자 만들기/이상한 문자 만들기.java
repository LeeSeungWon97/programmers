class Solution {
    public String solution(String s) {
        String answer = "";
        int idx = 0;
        String[] str = s.split("");
        for(int i=0; i<str.length;i++){
            if(str[i].equals(" ")){
                idx = 0;
            } else if(idx%2 == 0){
                str[i] = str[i].toUpperCase();
                idx++;
            }else{
                str[i] = str[i].toLowerCase();
                idx++;
            }
            answer += str[i];
        }
        return answer;
    }
}