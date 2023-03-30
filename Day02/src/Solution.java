import java.util.Arrays;

public class Solution {

    /*
        정수 num1과 num2가 매개변수로 주어질 때, num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분을 return 하도록 solution 함수를 완성해주세요.
     */
    public int solution01(int num1, int num2) {
        int answer = (int)((double) num1 / (double) num2 * 1000);
        System.out.println("answer: " + answer);
        return answer;
    }

    /*
        정수 num1과 num2가 매개변수로 주어집니다. 두 수가 같으면 1 다르면 -1을 return 하도록 solution 함수를 완성해주세요.
     */
    public int solution02(int num1, int num2) {
        int answer = -1;
        if(num1 == num2){
            answer = 1;
        }
        System.out.println("answer: " + answer);
        return answer;
    }

    /*
        첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1
        두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다.
        두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
     */

    public int[] solution03(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int numer = (numer1*denom2 + numer2*denom1);
        int denom = denom1*denom2;
        int gcd = 1;
        int bNum = numer;
        if(bNum > denom){
            bNum = denom;
        }
        for(int i=1;i<bNum+1;i++){
            if(numer%i == 0 && denom % i == 0){
                gcd = i;
            }
        }
        answer[0] = numer/gcd;
        answer[1] = denom/gcd;
        System.out.println(Arrays.toString(answer));
        return answer;
    }
    /*
        정수 배열 numbers가 매개변수로 주어집니다. numbers의 각 원소에 두배한 원소를 가진 배열을 return하도록 solution 함수를 완성해주세요.
     */
    public int[] solution04(int[] numbers) {
        int size = numbers.length;
        int[] answer = new int[size];

        for(int i = 0; i<numbers.length;i++){
            answer[i] = numbers[i] * 2;
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }

}
