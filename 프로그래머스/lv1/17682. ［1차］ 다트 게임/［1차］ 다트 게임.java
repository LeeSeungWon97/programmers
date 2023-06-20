class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        String[] str = dartResult.replaceAll("S|T|D"," ").replaceAll("\\*|#","").split(" ");
        int[] score = new int[str.length];
        for(int i=0; i<str.length; i++){
            score[i] = Integer.parseInt(str[i]);
        }
        String[] option = dartResult.replaceAll("[0-9]","").split("");
        int idx = 0;
        for(int i=0; i<option.length; i++){
            switch (option[i]){
                case "S":
                    idx++;
                    break;
                case "D":
                    score[idx] = (int) Math.pow(score[idx],2);
                    idx++;
                    break;
                case "T":
                    score[idx] = (int) Math.pow(score[idx],3);
                    idx++;
                    break;
                case "*":
                    idx--;
                    score[idx] = score[idx]*2;
                    if(idx-1 >= 0){
                        score[idx-1] = score[idx-1] * 2;
                    }
                    idx++;
                    break;
                case "#":
                    idx--;
                    score[idx] = score[idx] * (-1);
                    idx++;
                    break;
            }
        }
        for(int i=0; i< score.length; i++){
            answer += score[i];
        }
        return answer;
    }
}