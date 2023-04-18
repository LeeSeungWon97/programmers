import java.util.Arrays;

public class Solution {

    /*
        영어가 싫은 머쓱이는 영어로 표기되어있는 숫자를 수로 바꾸려고 합니다.
        문자열 numbers가 매개변수로 주어질 때, numbers를 정수로 바꿔 return 하도록 solution 함수를 완성해 주세요.
     */
    public long solution01(String numbers) {
        long answer = 0;
        String[] num = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        String[] digit = {"0","1","2","3","4","5","6","7","8","9"};
        for(int i=0; i< num.length;i++){
            numbers = numbers.replaceAll(num[i], digit[i]);
        }
        answer = Long.valueOf(numbers);
        System.out.println("answer: " + answer);
        return answer;
    }

    /*
        문자열 my_string과 정수 num1, num2가 매개변수로 주어질 때,
        my_string에서 인덱스 num1과 인덱스 num2에 해당하는 문자를 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.
     */
    public String solution02(String my_string, int num1, int num2) {
        String answer = "";
        for(int i = 0; i<my_string.length();i++){
            if(i==num1){
                answer += my_string.charAt(num2);
            } else if (i==num2) {
                answer += my_string.charAt(num1);
            } else {
                answer += my_string.charAt(i);
            }
        }
        System.out.println("answer: " + answer);
        return answer;
    }

    /*
        문자열 s가 매개변수로 주어집니다.
        s에서 한 번만 등장하는 문자를 사전 순으로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.
        한 번만 등장하는 문자가 없을 경우 빈 문자열을 return 합니다.
     */
    public String solution03(String s) {
        String answer = "";
        int[] cnt = new int[26];
        for(int i = 0; i < cnt.length ; i++){
            cnt[i] = 0;
        }
        for(int i = 0; i<s.length();i++){
            cnt[s.charAt(i)-'a'] += 1;
        }
        for(int i = 0; i < cnt.length; i++){
            if(cnt[i] == 1){
                answer += (char) (i+'a');
            }
        }
        System.out.println("answer: " + answer);
        return answer;
    }

    /*
        정수 n이 매개변수로 주어질 때, n의 약수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.
     */
    public int[] solution04(int n) {
        int cnt = 0;
        for(int i = 1; i<=n;i++){
            if(n%i == 0){
                cnt++;
            }
        }
        int[] answer = new int[cnt];
        int idx = 0;
        for(int i = 0;i<n;i++){
            if(n%(i+1) == 0){
                answer[idx] = i+1;
                idx++;
            }
        }
        System.out.println("answer[]: " + Arrays.toString(answer));
        return answer;
    }
}
