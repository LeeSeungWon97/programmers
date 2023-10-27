import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            String rotateStr = rotateString(s, i);
            if (isCorrectBasket(rotateStr)) {
                answer++;
            }
        }
        return answer;
    }

    private boolean isCorrectBasket (String s) {
        Stack<Character> stack = new Stack<>();
        List<Character> endBasket = new ArrayList<>(Arrays.asList(')', ']', '}'));
        for (char c : s.toCharArray()) {
            if (stack.isEmpty() && endBasket.contains(c)) {
                return false;
            }
            if (c == ')' && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && stack.peek() == '[') {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }

    private String rotateString(String s, int n) {
        String str1 = s.substring(0, n);
        String str2 = s.substring(n, s.length());
        return str2+str1;
    }
}