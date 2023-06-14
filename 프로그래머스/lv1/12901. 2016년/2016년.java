class Solution {
    public String solution(int a, int b) {
        int idx = 5;
        String[] days = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        int[] lastDay = {31,29,31,30,31,30,31,31,30,31,30,31};
        String answer = "";
        int month = 1;
        int day = 1;
        while(!(month==a && day==b)){
            day++;
            idx++;
            if(day > lastDay[month-1]){
                month++;
                day=1;
            }
            if(idx>6){
                idx = 0;
            }
        }
        answer = days[idx];
        return answer;
    }
}