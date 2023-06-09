class Solution {
     public int solution(String s) {
    int answer = 0;
        String[] numCode = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        while (!checkString(s)){
            for(int i=0;i<numCode.length;i++){
                s = s.replaceFirst(numCode[i],i+"");
            }
        }
        answer = Integer.parseInt(s);
        System.out.println(answer);
        return answer;
    }

    private boolean checkString(String str){
        try {
            Long.parseLong(str);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}