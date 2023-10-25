class Solution {
    public int solution(int n, int a, int b) {
        int round = 0;
        while (a != b) {
            round++;
            a = calc(a);
            b = calc(b);
        }
        return round;
    }

    private int calc(int num) {
        if (num % 2 == 0) {
            return num / 2;
        }
        return num / 2 + 1;
    }
}