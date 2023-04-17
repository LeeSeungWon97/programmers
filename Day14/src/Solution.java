import java.util.Arrays;

public class Solution {

    /*
        정수 배열 array와 정수 n이 매개변수로 주어질 때, array에 들어있는 정수 중 n과 가장 가까운 수를 return 하도록 solution 함수를 완성해주세요.
     */
    public int solution01(int[] array, int n) {
        int answer = 0;
        Arrays.sort(array);
        int[] sub = new int[array.length];
        for(int i = 0; i<array.length;i++){
            if(array[i] >= n){
                sub[i] = array[i]-n;
            }else {
                sub[i] = n-array[i];
            }
        }
        int min = sub[0];
        int idx = 0;
        for(int i = 0; i<sub.length;i++){
            if(min > sub[i]){
                min = sub[i];
                idx = i;
            }
        }
        answer = array[idx];
        System.out.println("sub[]: " + Arrays.toString(sub));
        System.out.println("answer: " + answer);
        return answer;
    }

    /*
        머쓱이는 친구들과 369게임을 하고 있습니다.
        369게임은 1부터 숫자를 하나씩 대며 3, 6, 9가 들어가는 숫자는 숫자 대신 3, 6, 9의 개수만큼 박수를 치는 게임입니다.
        머쓱이가 말해야하는 숫자 order가 매개변수로 주어질 때, 머쓱이가 쳐야할 박수 횟수를 return 하도록 solution 함수를 완성해보세요.
     */
    public int solution02(int order) {
        int answer = 0;
        String strOrder = String.valueOf(order);
        for(int i = 0; i<strOrder.length();i++){
            char c = strOrder.charAt(i);
            if(c == '3' || c == '6'|| c=='9'){
                answer++;
            }
        }
        System.out.println("answer: " + answer);
        return answer;
    }

    /*
        군 전략가 머쓱이는 전쟁 중 적군이 다음과 같은 암호 체계를 사용한다는 것을 알아냈습니다.
            - 암호화된 문자열 cipher를 주고받습니다.
            - 그 문자열에서 code의 배수 번째 글자만 진짜 암호입니다.
        문자열 cipher와 정수 code가 매개변수로 주어질 때 해독된 암호 문자열을 return하도록 solution 함수를 완성해주세요.
     */
    public String solution03(String cipher, int code) {
        String answer = "";
        for(int i = code-1; i<cipher.length();i += code){
            answer += cipher.charAt(i);
        }
        System.out.println("answer: " + answer);
        return answer;
    }

    /*
        문자열 my_string이 매개변수로 주어질 때, 대문자는 소문자로 소문자는 대문자로 변환한 문자열을 return하도록 solution 함수를 완성해주세요.
     */
    public String solution04(String my_string) {
        String answer = "";
        for(int i = 0; i<my_string.length();i++){
            char ch = my_string.charAt(i);
            if(Character.isUpperCase(ch)){
                answer += Character.toLowerCase(ch);
            } else if(Character.isLowerCase(ch)){
                answer += Character.toUpperCase(ch);
            } else{
                answer += ch;
            }
        }
        System.out.println("answer: " + answer);
        return answer;
    }
}
