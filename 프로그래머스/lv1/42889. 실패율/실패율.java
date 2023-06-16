class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[] stageInfo = new double[N];
        int user = stages.length;
        int idx = 0;
        for(int i=1; i<=N; i++){
            answer[idx] = i;
            stageInfo[idx] = 0.0;
            int failUser = 0;
            for(int j=0; j<stages.length; j++){
                if(stages[j] == i){
                    failUser++;
                }
            }
            if(failUser != 0){
                stageInfo[idx] = (double) failUser/user;
                user -= failUser;
            }
            idx++;
        }
        for(int i=0; i< answer.length-1; i++){
            if(stageInfo[i] < stageInfo[i+1]){
                int temp1 = answer[i];
                answer[i] = answer[i+1];
                answer[i+1] = temp1;
                double temp2 = stageInfo[i];
                stageInfo[i] = stageInfo[i+1];
                stageInfo[i+1] = temp2;
                i=-1;
            }
        }
        return answer;
    }
}