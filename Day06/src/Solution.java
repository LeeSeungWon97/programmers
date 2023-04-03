import java.util.Arrays;

public class Solution {

    /*
        문자열 my_string이 매개변수로 주어집니다. my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.
     */
    public String solution01(String my_string) {
        StringBuilder sb = new StringBuilder(my_string);
        String answer = sb.reverse().toString();
        System.out.println("answer: " + answer);
        return answer;
    }

    /*
        "*"의 높이와 너비를 1이라고 했을 때, "*"을 이용해 직각 이등변 삼각형을 그리려고합니다.
        정수 n 이 주어지면 높이와 너비가 n 인 직각 이등변 삼각형을 출력하도록 코드를 작성해보세요.
     */
    public void solution02(int n){
        for (int i = 0; i < n; i++) {
            for(int j = 0; j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
        정수가 담긴 리스트 num_list가 주어질 때, num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
     */
    public int[] solution03(int[] num_list) {
        int[] answer = new int[2];
        int oddCnt = 0;
        int evenCnt = 0;
        for (int i = 0; i < num_list.length; i++) {
            if(num_list[i] % 2 == 0){
                evenCnt++;
            } else {
                oddCnt++;
            }
        }
        answer[0] = evenCnt;
        answer[1] = oddCnt;
        System.out.println(Arrays.toString(answer));
        return answer;
    }

    /*
        문자열 my_string과 정수 n이 매개변수로 주어질 때, my_string에 들어있는 각 문자를 n만큼 반복한 문자열을 return 하도록 solution 함수를 완성해보세요.
     */
    public String solution04(String my_string, int n) {
        String answer = "";
        for(int i=0;i<my_string.length();i++){
            char ch = my_string.charAt(i);
            for(int j = 0; j<n; j++){
                answer += ch;
            }
        }
        System.out.println("answer: " + answer);
        return answer;
    }

}
