import java.util.Arrays;

public class Solution {
    /*
        정수 num과 k가 매개변수로 주어질 때, num을 이루는 숫자 중에 k가 있으면 num의 그 숫자가 있는 자리 수를 return하고 없으면 -1을 return 하도록 solution 함수를 완성해보세요.
     */
    public int solution01(int num, int k) {
        int answer = -1;
        String number = String.valueOf(num);
        for(int i = 0; i<number.length();i++){
            int n = Integer.parseInt(String.valueOf(number.charAt(i)));
            if(n == k){
                answer = i+1;
                break;
            }
        }
        System.out.println("answer: " + answer);
        return answer;
    }
    /*
        정수 n과 정수 배열 numlist가 매개변수로 주어질 때, numlist에서 n의 배수가 아닌 수들을 제거한 배열을 return하도록 solution 함수를 완성해주세요.
     */
    public int[] solution02(int n, int[] numlist) {
        int len = 0;
        for(int i = 0; i<numlist.length;i++){
            if(numlist[i]%n != 0){
                numlist[i] = -1;
            } else {
                len++;
            }
        }
        int[] answer = new int[len];
        int idx = 0;
        for(int i = 0; i<numlist.length;i++){
            if(numlist[i] != -1){
                answer[idx] = numlist[i];
                idx++;
            }
        }
        System.out.println("answer[]: " + Arrays.toString(answer));
        return answer;
    }

    /*
        정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return하도록 solution 함수를 완성해주세요.
     */
    public int solution03(int n) {
        int answer = 0;
        String number = String.valueOf(n);
        for(int i = 0; i<number.length();i++){
            answer += Integer.parseInt(String.valueOf(number.charAt(i)));
        }
        System.out.println("answer: " + answer);
        return answer;
    }

    /*
        덧셈, 뺄셈 수식들이 'X [연산자] Y = Z' 형태로 들어있는 문자열 배열 quiz가 매개변수로 주어집니다.
        수식이 옳다면 "O"를 틀리다면 "X"를 순서대로 담은 배열을 return하도록 solution 함수를 완성해주세요.
     */
    public String[] solution04(String[] quiz) {
        String[] answer = new String[quiz.length];
        for(int i = 0; i<quiz.length; i++){
            String[] str = quiz[i].split(" ");
            if(str[1].equals("+")){
                if(Integer.parseInt(str[0]) + Integer.parseInt(str[2]) == Integer.parseInt(str[4])){
                    answer[i] = "O";
                } else{
                    answer[i] = "X";
                }
            } else {
                if(Integer.parseInt(str[0]) - Integer.parseInt(str[2]) == Integer.parseInt(str[4])){
                    answer[i] = "O";
                } else{
                    answer[i] = "X";
                }
            }
        }
        System.out.println("answer: " + Arrays.toString(answer));
        return answer;
    }
}
