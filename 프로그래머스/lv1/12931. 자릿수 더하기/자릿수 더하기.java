import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String num = String.valueOf(n);
        char[] digit = num.toCharArray();
        for(int i=0;i<digit.length;i++){
            answer += Character.getNumericValue(digit[i]);
        }
        return answer;
    }
}