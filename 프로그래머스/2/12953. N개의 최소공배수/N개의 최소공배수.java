class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];
        for (int i = 1; i < arr.length; i++) {
            answer = getLcm(answer, arr[i]);
        }
        return answer;
    }

    public int getGcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return getGcd(b, a % b);
    }

    public int getLcm(int a, int b) {
        return (a * b) / getGcd(a, b);
    }

}