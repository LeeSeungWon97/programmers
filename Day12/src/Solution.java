import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    /*
        영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다.
        문자열 my_string이 매개변수로 주어질 때 모음을 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
     */
    public String solution01(String my_string) {
        String answer = "";
        int len = my_string.length();

        for(int i =0; i<len;i++){
            char ch = my_string.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                answer += "";
            } else {
                answer += ch;
            }
        }
        System.out.println("answer: " + answer);
        return answer;
    }

    /*
        문자열 my_string이 매개변수로 주어질 때, my_string 안에 있는 숫자만 골라 오름차순 정렬한 리스트를 return 하도록 solution 함수를 작성해보세요.
     */
    public int[] solution02(String my_string) {
        String numbers = my_string.replaceAll("[^0-9]","");
        System.out.println("numbers: " + numbers);
        int[] answer = new int[numbers.length()];
        for (int i = 0; i < numbers.length(); i++) {
            int num = numbers.charAt(i) - '0';
            answer[i] = num;
        }
        Arrays.sort(answer);
        System.out.println("answer[]: " + Arrays.toString(answer));
        return answer;
    }

    /*
        문자열 my_string이 매개변수로 주어집니다.
        my_string안의 모든 자연수들의 합을 return하도록 solution 함수를 완성해주세요.
     */
    public int solution03(String my_string) {
        String numbers = my_string.replaceAll("[^0-9]","");
        int len = numbers.length();
        int answer = 0;
        for(int i=0;i<len;i++){
            int num = numbers.charAt(i)-'0';
            answer += num;
        }
        System.out.println("answer: " + answer);
        return answer;
    }

    /*
        소인수분해란 어떤 수를 소수들의 곱으로 표현하는 것입니다.
        예를 들어 12를 소인수 분해하면 2 * 2 * 3 으로 나타낼 수 있습니다.
        따라서 12의 소인수는 2와 3입니다.
        자연수 n이 매개변수로 주어질 때 n의 소인수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.
     */
    public int[] solution04(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 2; i<=n ; i++){
            if(n%i == 0){
                while(n % i == 0){
                    n /= i;
                }
                list.add(i);
            }
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i<list.size();i++){
            answer[i] = list.get(i);
        }
        System.out.println("answer[]: " + Arrays.toString(answer));
        return answer;
    }
}
