class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for(int i=0; i<number; i++){
            int divisionCnt = getDivisionCount(i+1);
            if(divisionCnt > limit){
                answer += power;
            } else {
                answer += divisionCnt;
            }
        }
        System.out.println(answer);
        return answer;
    }

    int getDivisionCount(int num){
        int cnt = 0;
        int sqrt = (int) Math.sqrt(num);
        for(int i=1; i<=sqrt; i++){
            if(num%i==0){
                cnt += 2;
            }
        }
        if(sqrt * sqrt == num){
            cnt--;
        }
        return cnt;
    }
}