class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for(String babble : babbling){
            babble = babble.replaceAll("ayaaya|yeye|woowoo|mama"," ");
            babble = babble.replaceAll("aya|ye|woo|ma","");
            if(babble.equals("")){
                answer++;
            }
        }
        return answer;
    }
}