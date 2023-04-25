import java.util.Arrays;

public class Solution {
    /*
        머쓱이는 행운의 숫자 7을 가장 좋아합니다. 정수 배열 array가 매개변수로 주어질 때, 7이 총 몇 개 있는지 return 하도록 solution 함수를 완성해보세요.
     */
    public int solution01(int[] array) {
        int answer = 0;
        String num = "";
        for(int i = 0; i<array.length;i++){
            num += array[i];
        }
        for(int i = 0; i<num.length();i++){
            if(num.charAt(i)=='7'){
                answer++;
            }
        }
        System.out.println("answer: " + answer);
        return answer;
    }

    /*
        문자열 my_str과 n이 매개변수로 주어질 때, my_str을 길이 n씩 잘라서 저장한 배열을 return하도록 solution 함수를 완성해주세요.
     */
    public String[] solution02(String my_str, int n) {
        int len = my_str.length() / n;
        if(my_str.length() % n != 0){
            len++;
        }
        String[] answer = new String[len];
        String str = "";
        int cnt = 0;
        int idx = 0;
        for(int i = 0 ; i<my_str.length();i++){
            str += my_str.charAt(i);
            cnt++;
            if(cnt == n || (i == my_str.length()-1)){
                answer[idx] = str;
                str = "";
                cnt = 0;
                idx++;
            }
        }
        System.out.println("answer: " + Arrays.toString(answer));
        return answer;
    }
    /*
        정수가 담긴 배열 array와 정수 n이 매개변수로 주어질 때, array에 n이 몇 개 있는 지를 return 하도록 solution 함수를 완성해보세요.
     */
    public int solution03(int[] array, int n) {
        int answer = 0;
        for(int i=0;i<array.length;i++){
            if(array[i] == n){
                answer++;
            }
        }
        System.out.println("answer: " + answer);
        return answer;
    }

    /*
        머쓱이는 학교에서 키 순으로 줄을 설 때 몇 번째로 서야 하는지 궁금해졌습니다.
        머쓱이네 반 친구들의 키가 담긴 정수 배열 array와 머쓱이의 키 height가 매개변수로 주어질 때, 머쓱이보다 키 큰 사람 수를 return 하도록 solution 함수를 완성해보세요.
     */
    public int solution04(int[] array, int height) {
        int answer = 0;
        Arrays.sort(array);
        for(int i=0;i<array.length;i++){
            if(array[i] > height){
                answer++;
            }
        }
        System.out.println("answer: " + answer);
        return answer;
    }
}
