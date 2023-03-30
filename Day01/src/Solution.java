public class Solution {

    /*
        정수 num1과 num2가 주어질 때, num1과 num2의 합을 return하도록 soltuion 함수를 완성해주세요.
     */
    public int solution01(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("num1 + num2 = " + sum);
        return sum;
    }

    /*
        정수 num1과 num2가 주어질 때, num1에서 num2를 뺀 값을 return하도록 soltuion 함수를 완성해주세요.
     */
    public int solution02(int num1, int num2) {
        int sub = num1 - num2;
        System.out.println("num1 - num2 = " + sub);
        return sub;
    }

    /*
        정수 num1, num2가 매개변수 주어집니다. num1과 num2를 곱한 값을 return 하도록 solution 함수를 완성해주세요.
     */
    public int solution03(int num1, int num2) {
        int multi = num1 * num2;
        System.out.println("num1 * num2 = " + multi);
        return multi;
    }

    /*
       정수 num1, num2가 매개변수로 주어질 때, num1을 num2로 나눈 몫을 return 하도록 solution 함수를 완성해주세요.
     */
    public int solution04(int num1, int num2) {
        int div = num1 / num2;
        System.out.println("num1 / num2 = " + div);
        return div;
    }
}
