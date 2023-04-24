import java.util.Arrays;

public class Solution {

    /*
        문자열 str1, str2가 매개변수로 주어집니다. str1 안에 str2가 있다면 1을 없다면 2를 return하도록 solution 함수를 완성해주세요.
     */
    public int solution01(String str1, String str2) {
        int answer = 2;
        if(str1.contains(str2)) {
            answer = 1;
        }
        System.out.println("answer: " + answer);
        return answer;
    }

    /*
        어떤 자연수를 제곱했을 때 나오는 정수를 제곱수라고 합니다. 정수 n이 매개변수로 주어질 때, n이 제곱수라면 1을 아니라면 2를 return하도록 solution 함수를 완성해주세요.
     */
    public int solution02(int n) {
        int answer = 2;
        if(n % Math.sqrt(n) == 0){
            answer = 1;
        }
        System.out.println("answer: " + answer);
        return answer;
    }

    /*
        어떤 세균은 1시간에 두배만큼 증식한다고 합니다.
        처음 세균의 마리수 n과 경과한 시간 t가 매개변수로 주어질 때 t시간 후 세균의 수를 return하도록 solution 함수를 완성해주세요.
     */
    public int solution03(int n, int t) {
        int answer = n * (int)Math.pow(2,t);
        System.out.println("answer: " + answer);
        return answer;
    }

    /*
        영어 대소문자로 이루어진 문자열 my_string이 매개변수로 주어질 때,
        my_string을 모두 소문자로 바꾸고 알파벳 순서대로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.
     */
    public String solution04(String my_string) {
        char[] charArr = my_string.toLowerCase().toCharArray();
        Arrays.sort(charArr);
        String answer = new String(charArr);
        System.out.println("answer: " + answer);
        return answer;
    }
}
