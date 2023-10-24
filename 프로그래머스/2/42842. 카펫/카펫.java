class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int total = brown + yellow;
        for (int i = 3; i <= total / 3; i++) {
            if (total % i == 0) {
                int width = total / i;
                int height = i;
                int yellowCount = (width - 2) * (height - 2);

                if (yellowCount == yellow) {
                    answer[0] = width;
                    answer[1] = height;
                    break;
                }
            }
        }
        return answer;
    }
}