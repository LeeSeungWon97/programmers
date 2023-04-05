import java.util.Arrays;
import java.util.Collections;

public class Solution {

    /*
        정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때, numbers의 num1번 째 인덱스부터 num2번째 인덱스까지 자른 정수 배열을 return 하도록 solution 함수를 완성해보세요.
     */
    public int[] solution01(int[] numbers, int num1, int num2) {
        int len = num2-num1+1;
        int[] answer = new int[len];
        for(int i = 0; i < len; i++){
            answer[i] = numbers[i+num1];
        }
        System.out.println("answer[]: " + Arrays.toString(answer));
        return answer;
    }

    /*
        우주여행을 하던 머쓱이는 엔진 고장으로 PROGRAMMERS-962 행성에 불시착하게 됐습니다.
        입국심사에서 나이를 말해야 하는데, PROGRAMMERS-962 행성에서는 나이를 알파벳으로 말하고 있습니다.
        a는 0, b는 1, c는 2, ..., j는 9입니다. 예를 들어 23살은 cd, 51살은 fb로 표현합니다.
        나이 age가 매개변수로 주어질 때 PROGRAMMER-962식 나이를 return하도록 solution 함수를 완성해주세요.
     */
    public String solution02(int age) {
        String answer = "";
        String[] alpha = {"a","b","c","d","e","f","g","h","i","j"};
        int i = 1000;
        while(i>0){
            int idxNum = age/i;
            if(!(age/i == 0 && answer.length() == 0)){
                answer += alpha[idxNum];
            }
            age -= idxNum*i;
            i /= 10;
        }
        System.out.println("answer: " + answer);
        return answer;
    }

    /*
        외과의사 머쓱이는 응급실에 온 환자의 응급도를 기준으로 진료 순서를 정하려고 합니다.
        정수 배열 emergency가 매개변수로 주어질 때 응급도가 높은 순서대로 진료 순서를 정한 배열을 return하도록 solution 함수를 완성해주세요.
     */
    public int[] solution03(int[] emergency) {
        int len = emergency.length;
        int[] answer = new int[len];
        Integer[] priority = Arrays.stream(emergency).boxed().toArray(Integer[]::new);
        Arrays.sort(priority,Collections.reverseOrder());
        for(int i = 0; i<len;i++){
            for(int j =0; j<len;j++){
                if(emergency[i] == priority[j]){
                    answer[i] = j+1;
                }
            }
        }
        System.out.println("answer[]: " + Arrays.toString(answer));
        return answer;
    }

    /*
        순서쌍이란 두 개의 숫자를 순서를 정하여 짝지어 나타낸 쌍으로 (a, b)로 표기합니다.
        자연수 n이 매개변수로 주어질 때 두 숫자의 곱이 n인 자연수 순서쌍의 개수를 return하도록 solution 함수를 완성해주세요.
     */
    public int solution04(int n) {
        int answer = 0;
        for(int i = 1; i<= n; i++){
            if(n%i == 0){
                answer++;
            }
        }
        System.out.println("answer: " + answer);
        return answer;
    }
}
