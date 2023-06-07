class Solution {
    public int solution(int n) {
        int answer = 0;
        int current = n;
        String num = "";
        while(current != 0){
            num += current%3;
            current /= 3;
        }
        System.out.println("num: " + num);
        for(int i=0; i<num.length();i++){
            int digit = num.charAt(i) - '0';
            answer += digit * Math.pow(3,num.length()-(1+i));
        }
        return answer;
    }
}