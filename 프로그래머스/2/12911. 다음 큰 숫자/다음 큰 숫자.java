class Solution {
    public int solution(int n) {
        int cnt = Integer.toBinaryString(n).replace("0","").length();
        while (true) {
            n += 1;
            if (Integer.toBinaryString(n).replace("0", "").length() == cnt) {
                return n;
            }
        }
    }
}