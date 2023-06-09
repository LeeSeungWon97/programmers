class Solution {
     public int solution(String s) {
        int answer = 0;
        String[] numCode = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        for(int i=0; i<numCode.length;i++){
            s=s.replaceAll(numCode[i],i+"");
        }
        answer = Integer.parseInt(s);
        System.out.println(answer);
        return answer;
    }
}