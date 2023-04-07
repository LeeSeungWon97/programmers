import java.util.Arrays;

public class Solution {

    /*
        사분면은 한 평면을 x축과 y축을 기준으로 나눈 네 부분입니다. 사분면은 아래와 같이 1부터 4까지 번호를매깁니다.
        x 좌표 (x, y)를 차례대로 담은 정수 배열 dot이 매개변수로 주어집니다.
        좌표 dot이 사분면 중 어디에 속하는지 1, 2, 3, 4 중 하나를 return 하도록 solution 함수를 완성해주세요.
     */
    public int solution01(int[] dot) {
        int answer = 0;
        int x = dot[0];
        int y = dot[1];
        if(x>0 && y>0){
            answer = 1;
        } else if (x<0 && y>0) {
            answer = 2;
        } else if (x<0 && y<0) {
            answer = 3;
        } else {
            answer = 4;
        }
        System.out.println("answer: " + answer);
        return answer;
    }

    /*
        정수 배열 num_list와 정수 n이 매개변수로 주어집니다. num_list를 다음 설명과 같이 2차원 배열로 바꿔 return하도록 solution 함수를 완성해주세요.
        num_list가 [1, 2, 3, 4, 5, 6, 7, 8] 로 길이가 8이고 n이 2이므로 num_list를 2 * 4 배열로 다음과 같이 변경합니다.
        2차원으로 바꿀 때에는 num_list의 원소들을 앞에서부터 n개씩 나눠 2차원 배열로 변경합니다.
     */
    public int[][] solution02(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        int idx = 0;
        for(int i =0; i<num_list.length/n;i++){
            for(int j = 0; j<n;j++){
                answer[i][j] = num_list[idx];
                idx++;
            }
        }
        System.out.println("answer[][]: " + Arrays.deepToString(answer));
        return answer;
    }

    /*
        머쓱이는 친구들과 동그랗게 서서 공 던지기 게임을 하고 있습니다.
        공은 1번부터 던지며 오른쪽으로 한 명을 건너뛰고 그다음 사람에게만 던질 수 있습니다.
        친구들의 번호가 들어있는 정수 배열 numbers와 정수 K가 주어질 때, k번째로 공을 던지는 사람의 번호는 무엇인지 return 하도록 solution 함수를 완성해보세요.
     */
    public int solution03(int[] numbers, int k) {
        int answer = 0;
        int len = numbers.length;
        int i = 1;
        int idx = 0;
        while(i < k){
            idx += 2;
            i++;
        }
        idx %= len;
        answer = numbers[idx];
        System.out.println("answer: " + answer);
        return answer;
    }

    /*
        정수가 담긴 배열 numbers와 문자열 direction가 매개변수로 주어집니다.
        배열 numbers의 원소를 direction방향으로 한 칸씩 회전시킨 배열을 return하도록 solution 함수를 완성해주세요.
     */
    public int[] solution04(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        int len = numbers.length;
        switch (direction){
            case "right":
                answer[0] = numbers[len-1];
                for(int i = 1;i<len;i++){
                    answer[i] = numbers[i-1];
                }
                break;
            case "left":
                answer[len-1] = numbers[0];
                for(int i = 0; i<len-1; i++){
                    answer[i] = numbers[i+1];
                }
                break;
        }
        System.out.println("answer[]: " + Arrays.toString(answer));
        return answer;
    }
}
