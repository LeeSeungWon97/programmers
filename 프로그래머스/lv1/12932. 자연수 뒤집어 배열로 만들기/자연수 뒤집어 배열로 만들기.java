class Solution {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        char[] num = str.toCharArray();
        int[] answer =  new int[str.length()];
        for(int i=0; i<str.length(); i++){
            answer[i] = num[num.length-1-i]-'0';
        }
        return answer;
    }
}