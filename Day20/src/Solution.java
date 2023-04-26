import java.util.Arrays;
import java.util.Enumeration;

public class Solution {

    /*
        2차원 좌표 평면에 변이 축과 평행한 직사각형이 있습니다.
        직사각형 네 꼭짓점의 좌표 [[x1, y1], [x2, y2], [x3, y3], [x4, y4]]가 담겨있는 배열 dots가 매개변수로 주어질 때,
        직사각형의 넓이를 return 하도록 solution 함수를 완성해보세요.
     */
    public int solution01(int[][] dots) {
        int answer = 0;
        int x1 = dots[0][0];
        int y1 = dots[0][1];
        int w = 0;
        int h = 0;
        for(int i = 1;i<dots.length;i++){
            if( x1 != dots[i][0]){
                w = Math.abs(x1 - dots[i][0]);
            }
            if(y1 != dots[i][1]){
                h = Math.abs(y1 - dots[i][1]);
            }
        }
        answer = w * h;
        System.out.println("answer: " + answer);
        return answer;
    }

    /*
        머쓱이는 RPG게임을 하고 있습니다. 게임에는 up, down, left, right 방향키가 있으며 각 키를 누르면 위, 아래, 왼쪽, 오른쪽으로 한 칸씩 이동합니다.
        예를 들어 [0,0]에서 up을 누른다면 캐릭터의 좌표는 [0, 1], down을 누른다면 [0, -1], left를 누른다면 [-1, 0], right를 누른다면 [1, 0]입니다.
        머쓱이가 입력한 방향키의 배열 keyinput와 맵의 크기 board이 매개변수로 주어집니다.
        캐릭터는 항상 [0,0]에서 시작할 때 키 입력이 모두 끝난 뒤에 캐릭터의 좌표 [x, y]를 return하도록 solution 함수를 완성해주세요.
            * [0, 0]은 board의 정 중앙에 위치합니다. 예를 들어 board의 가로 크기가 9라면 캐릭터는 왼쪽으로 최대 [-4, 0]까지 오른쪽으로 최대 [4, 0]까지 이동할 수 있습니다.
     */
    public int[] solution02(String[] keyinput, int[] board) {
        int[] answer = {0,0};
        int xMax = Math.abs(board[0]/2);
        int xMin = -xMax;
        int yMax = Math.abs(board[1]/2);
        int yMin = -yMax;
        int i = 0;
        while(i< keyinput.length){
            switch (keyinput[i]){
                case "left":
                    if(answer[0] > xMin){
                        answer[0]--;
                    }
                    break;
                case "right":
                    if(answer[0] < xMax) {
                        answer[0]++;
                    }
                    break;
                case "up":
                    if(answer[1] < yMax) {
                        answer[1]++;
                    }
                    break;
                case "down":
                    if(answer[1] > yMin) {
                        answer[1]--;
                    }
                    break;
            }
            i++;
        }
        System.out.println("start[]: " + Arrays.toString(answer));
        return answer;
    }

    /*
        정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.
     */
    public int solution03(int[] numbers) {
        int answer = numbers[0] * numbers[1];
        for(int i = 0; i<numbers.length;i++){
            for(int j = 0; j<numbers.length;j++){
                if(i == j) continue;
                else if(answer < numbers[i]*numbers[j]){
                    answer = numbers[i]*numbers[j];
                }
            }
        }
        System.out.println("answer: " + answer);
        return answer;
    }
    /*
        한 개 이상의 항의 합으로 이루어진 식을 다항식이라고 합니다.
        다항식을 계산할 때는 동류항끼리 계산해 정리합니다.
        덧셈으로 이루어진 다항식 polynomial이 매개변수로 주어질 때, 동류항끼리 더한 결괏값을 문자열로 return 하도록 solution 함수를 완성해보세요.
        같은 식이라면 가장 짧은 수식을 return 합니다.
     */
    public String solution04(String polynomial) {
        String answer = "";
        String[] str = polynomial.split(" \\+ ");
        System.out.println("str[]: " + Arrays.toString(str));
        int coef = 0;
        int cons = 0;
        for(int i = 0; i<str.length;i++){
            if(str[i].equals("x")){
                coef++;
            }else if(str[i].contains("x")){
                coef += Integer.parseInt(str[i].replaceAll("x",""));
            }else {
                cons += Integer.parseInt(str[i]);
            }
        }
        if(coef == 0){
            if(cons != 0){
                answer = String.valueOf(cons);
            }
        } else{
            if(cons != 0){
                if(coef != 1){
                    answer = coef + "x + " + cons;
                } else{
                    answer = "x + " + cons;
                }
            } else{
                if(coef != 1){
                    answer = coef + "x";
                }else{
                    answer = "x";
                }
            }
        }
        System.out.println("answer: " + answer);
        return answer;
    }
}
