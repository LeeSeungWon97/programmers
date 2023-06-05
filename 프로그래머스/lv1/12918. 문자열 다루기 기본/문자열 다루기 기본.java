class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if(!(s.length()==4 || s.length()==6)){
            answer = false;
        }
        char[] ch = s.toCharArray();
        for(int i=0; i<ch.length; i++){
            if(ch[i]<48 || ch[i]>57){
                answer = false;
                break;
            }
        }
        return answer;
    }
}