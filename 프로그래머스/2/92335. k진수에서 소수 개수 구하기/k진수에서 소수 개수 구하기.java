class Solution {
    int count = 0;

    public int solution(int n, int k) {
        String str = convertDecimalToBaseK(n, k);
        countPrime(str);
        return count;
    }

    private String convertDecimalToBaseK(int n, int k) {
        if (n == 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            int remainder = n % k;
            sb.insert(0, remainder);
            n = n / k;
        }
        return sb.toString();
    }

    private void countPrime(String str) {
        String[] arr = str.split("0");
        for (String s : arr) {
            long num = 0;
            try {
                num = Long.parseLong(s);
            } catch (Exception e) {
                continue;
            }
            if (isPrime(num)) {
                count++;
            }
        }
    }

    private boolean isPrime(long num) {
        if (num == 2) {
            return true;
        } else if (num < 2 || num % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}