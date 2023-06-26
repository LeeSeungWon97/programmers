class Solution {
    public String solution(String X, String Y) {
        StringBuilder sb = new StringBuilder();

        String answer = "";
        int[] xNumCnt = new int[10];
        int[] yNumCnt = new int[10];
        for(String x : X.split("")){
            xNumCnt[Integer.parseInt(x)]++;
        }
        for(String y : Y.split("")){
            yNumCnt[Integer.parseInt(y)]++;
        }
        for(int i=9; i>=0; i--){
            while(xNumCnt[i] > 0 && yNumCnt[i] > 0){
                sb.append(i);
                xNumCnt[i]--;
                yNumCnt[i]--;
            }
        }
        answer = sb.toString();
        if(answer.equals("")){
            return "-1";
        } else if (answer.replaceAll("0","").equals("")) {
            return "0";
        }
        return answer;
    }
}