import java.util.Arrays;
class Solution {
    public String solution(String[] seoul) {
        String answer = "김서방은 x에 있다";
        int idx = Arrays.asList(seoul).indexOf("Kim");
        answer = answer.replace("x",String.valueOf(idx));
        return answer;
    }
}