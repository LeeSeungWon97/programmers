import java.util.*;

public class Solution {
    public String solution(String s) {
        String answer = "";
        String[] strArr = s.split(" ");
        int[] numbers = new int[strArr.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(strArr[i]);
        }
        Arrays.sort(numbers);
        answer = numbers[0] + " " + numbers[numbers.length - 1];
        System.out.println("answer = " + answer);
        return answer;
    }
}
