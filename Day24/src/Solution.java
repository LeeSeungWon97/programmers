public class Solution {

    public int solution01(int chicken) {
        System.out.println("chicken: " + chicken);
        int answer = 0;
        int service = 0;
        int coupon = chicken;
        boolean run = true;
        while (run){
            service = coupon/10;
            coupon = coupon%10 + service;
            answer += service;
            System.out.println("service: " + service);
            System.out.println("coupon: " + coupon);
            System.out.println("answer: " + answer);
            if(coupon < 10){
                run = false;
            }
        }
        return answer;
    }

    // Problem 2
    public String solution02(String bin1, String bin2) {
        String answer = "";
        int num1 = Integer.parseInt(bin1,2);
        int num2 = Integer.parseInt(bin2,2);
        answer = Integer.toBinaryString(num1+num2);
        System.out.println("answer: " + answer);
        return answer;
    }

    // Problem 3
    public int solution03(String before, String after) {
        int answer = 0;
        for(int i = 0; i<before.length();i++){
            after = after.replaceFirst(String.valueOf(before.charAt(i)),"0");
        }
        System.out.println("after: " + after);
        after = after.replaceAll("0","");
        if(after.length() == 0){
            answer = 1;
        }
        System.out.println("answer: " +answer);
        return answer;
    }

    // problem 4
    public int solution04(int i, int j, int k) {
        int answer = 0;
        for(int range = i; range <= j; range++){
            String num = String.valueOf(range);
            char compare = Character.forDigit(k,10);
            char[] digit = num.toCharArray();
            for(int idx = 0; idx<digit.length;idx++){
                if(digit[idx] == compare){
                    answer++;
                }
            }
        }
        System.out.println("answer: " + answer);
        return answer;
    }
}
