class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long pay = 0;
        for(int i=1;i<=count;i++){
            pay += price*i;
        }
        long balance = (long)money - pay;
        if(balance>=0){
            answer = 0;
        } else {
            answer = -balance;
        }
        return answer;
    }
}