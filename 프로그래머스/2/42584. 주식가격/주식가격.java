import java.util.Arrays;
import java.util.Stack;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < prices.length; i++) {
            // stack이 비어있지 않고, 현재 index의 값이 이전 값보다 작은 경우
            while (!stack.isEmpty() && (prices[i] < prices[stack.peek()])) {
                answer[stack.peek()] = i - stack.peek();
                stack.pop(); // 가격이 떨어진 경우의 index 값을 추출
            }
            // stack이 비어있는 경우 -> push
            stack.push(i);
        }
        
        // 남아 있는 stack 처리
        while (!stack.isEmpty()) {
            answer[stack.peek()] = (prices.length - 1) - stack.peek();
            stack.pop();
        }
        return answer;
    }
}