import java.util.Arrays;

public class Solution {
    /*
        머쓱이는 할머니께 생신 축하 편지를 쓰려고 합니다.
        할머니가 보시기 편하도록 글자 한 자 한 자를 가로 2cm 크기로 적으려고 하며,
        편지를 가로로만 적을 때, 축하 문구 message를 적기 위해 필요한 편지지의 최소 가로길이를 return 하도록 solution 함수를 완성해주세요.
     */
    public int solution01(String message) {
        int answer = message.length() * 2;
        System.out.println("answer: " + answer);
        return answer;
    }

    /*
        정수 배열 array가 매개변수로 주어질 때, 가장 큰 수와 그 수의 인덱스를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
     */
    public int[] solution02(int[] array) {
        int[] answer = new int[2];
        int idx = 0;
        int max = array[0];
        for(int i = 0; i<array.length;i++){
            if(max < array[i]){
                max = array[i];
                idx = i;
            }
        }
        answer[0] = max;
        answer[1] = idx;

        System.out.println("answer: " + Arrays.toString(answer));
        return answer;
    }

    /*
        my_string은 "3 + 5"처럼 문자열로 된 수식입니다. 문자열 my_string이 매개변수로 주어질 때, 수식을 계산한 값을 return 하는 solution 함수를 완성해주세요.
     */
    public int solution03(String my_string) {
        String[] str = my_string.split(" ");
        int answer = Integer.parseInt(str[0]);
        for(int i = 1; i<str.length;i+=2){
            if(str[i].equals("+")){
                answer += Integer.parseInt(str[i+1]);
            }else {
                answer -= Integer.parseInt(str[i+1]);
            }
        }
        System.out.println("answer: " + answer);
        return answer;
    }

    /*
        두 배열이 얼마나 유사한지 확인해보려고 합니다. 문자열 배열 s1과 s2가 주어질 때 같은 원소의 개수를 return하도록 solution 함수를 완성해주세요.
     */
    public int solution04(String[] s1, String[] s2) {
        int answer = 0;
        for(int i = 0; i<s1.length;i++){
            for(int j =0; j<s2.length;j++){
                if(s1[i].equals(s2[j])) answer++;
            }
        }
        System.out.println("answer: " + answer);
        return answer;
    }
}
