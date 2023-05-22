import java.util.Arrays;

public class Solution {

    /*
        3x 마을 사람들은 3을 저주의 숫자라고 생각하기 때문에 3의 배수와 숫자 3을 사용하지 않습니다.
        3x 마을 사람들의 숫자는 다음과 같습니다.
        정수 n이 매개변수로 주어질 때, n을 3x 마을에서 사용하는 숫자로 바꿔 return하도록 solution 함수를 완성해주세요.
     */
    public int solution01(int n) {
        int answer = 0;
        for (int i = 0; i < n; i++){
            answer++;
            while (answer % 3 == 0 || String.valueOf(answer).contains("3")){
                answer++;
            }
        }
        System.out.println("answer: " + answer);
        return answer;
    }

    /*
        점 네 개의 좌표를 담은 이차원 배열  dots가 다음과 같이 매개변수로 주어집니다.
            [[x1, y1], [x2, y2], [x3, y3], [x4, y4]]
        주어진 네 개의 점을 두 개씩 이었을 때, 두 직선이 평행이 되는 경우가 있으면 1을 없으면 0을 return 하도록 solution 함수를 완성해보세요.
     */
    public int solution02(int[][] dots) {
        int answer = 0;
        if(getSlope(dots[0],dots[1]) == getSlope(dots[2],dots[3])){
            answer = 1;
        } else if (getSlope(dots[0],dots[2]) == getSlope(dots[1],dots[3])) {
            answer = 1;
        } else if (getSlope(dots[0],dots[3]) == getSlope(dots[1],dots[2])) {
            answer = 1;
        }
        System.out.println("answer: " + answer);
        return answer;
    }
    private double getSlope(int[] dot1, int[] dot2){
        return (double) (dot2[1]-dot1[1])/(dot2[0]-dot1[0]);
    }

    /*
        선분 3개가 평행하게 놓여 있습니다.
        세 선분의 시작과 끝 좌표가 [[start, end], [start, end], [start, end]] 형태로 들어있는 2차원 배열 lines가 매개변수로 주어질 때,
        두 개 이상의 선분이 겹치는 부분의 길이를 return 하도록 solution 함수를 완성해보세요.
     */
    public int solution03(int[][] lines) {
        int answer = 0;
        int[] check = new int[200];
        for(int i = 0; i < lines.length; i++){
            int start = lines[i][0] + 100;
            int end = lines[i][1] + 100;
            for(int j = start; j < end; j++){
                check[j]++;
            }
        }
        for(int i = 0; i<check.length;i++){
            if(check[i] > 1){
                answer++;
            }
        }
        System.out.println("answer: " + answer);
        return answer;
    }

    /*
        소수점 아래 숫자가 계속되지 않고 유한개인 소수를 유한소수라고 합니다.
        분수를 소수로 고칠 때 유한소수로 나타낼 수 있는 분수인지 판별하려고 합니다.
        유한소수가 되기 위한 분수의 조건은 다음과 같습니다.
            - 기약분수로 나타내었을 때, 분모의 소인수가 2와 5만 존재해야 합니다.
        두 정수 a와 b가 매개변수로 주어질 때, a/b가 유한소수이면 1을, 무한소수라면 2를 return하도록 solution 함수를 완성해주세요.
     */
    public int solution04(int a, int b) {
        int answer = 1;
        for(int i = a; i>0;i--){
            if(a%i == 0 && b%i == 0) {
                a /= i;
                b /= i;
            }
        }
        while(b != 1){
            if(b%2 == 0) b/=2;
            else if(b%5 == 0) b/=5;
            else {
                answer = 2;
                break;
            }
        }
        System.out.println("answer: " + answer);
        return answer;
    }
}
