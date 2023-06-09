class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        Long pNum = Long.parseLong(p);
        for (int i=0;i<t.length()-p.length()+1;i++) {
            Long tNum = Long.parseLong(t.substring(i,i+p.length()));
            System.out.println("tNum: " + tNum);
            if(pNum>=tNum){
                answer++;
            }
        }
        System.out.println("answer: " + answer);
        return answer;
    }
}