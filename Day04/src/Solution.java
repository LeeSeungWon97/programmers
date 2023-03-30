public class Solution {
    /*
        머쓱이네 피자가게는 피자를 일곱 조각으로 잘라 줍니다.
        피자를 나눠먹을 사람의 수 n이 주어질 때, 모든 사람이 피자를 한 조각 이상 먹기 위해 필요한 피자의 수를 return 하는 solution 함수를 완성해보세요.
     */
    public int solution01(int n) {
        // 피자 한판의 조각 수
        int PIECE = 7;
        // 피자 판 개수
        int cnt = 1;
        while(PIECE*cnt/n == 0){
            cnt++;
        }
        System.out.println("나눠먹을 사람 수: " + n);
        System.out.println("필요한 피자의 수: " + cnt);

        return cnt;
    }

    /*
        머쓱이네 피자가게는 피자를 여섯 조각으로 잘라 줍니다.
        피자를 나눠먹을 사람의 수 n이 매개변수로 주어질 때,
        n명이 주문한 피자를 남기지 않고 모두 같은 수의 피자 조각을 먹어야 한다면 최소 몇 판을 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.
     */
    public int solution02(int n) {
        // 피자 한판의 조각 수
        int PIECE = 6;
        // 피자 판 개수
        int cnt = 1;
        while((cnt*6)%n != 0){
            cnt++;
        }
        System.out.println("나눠먹을 사람의 수: " + n);
        System.out.println("필요한 피자의 수: " + cnt);
        System.out.println("1인당 먹는 조각: " + cnt*6/n);
        return cnt;
    }

    /*
        머쓱이네 피자가게는 피자를 두 조각에서 열 조각까지 원하는 조각 수로 잘라줍니다.
        피자 조각 수 slice와 피자를 먹는 사람의 수 n이 매개변수로 주어질 때,
        n명의 사람이 최소 한 조각 이상 피자를 먹으려면 최소 몇 판의 피자를 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.
     */
    public int solution03(int slice, int n) {
        // 피자 판 개수
        int cnt = (n+slice-1)/slice;
        System.out.println("피자 판수: " + cnt);
        return cnt;
    }

    /*
        정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.
     */
    public double solution04(int[] numbers) {
        double answer = 0;
        double arrLen = numbers.length;
        double arrSum = 0;
        for(int i=0; i<arrLen;i++){
            arrSum += numbers[i];
        }
        answer = arrSum/arrLen;
        System.out.println("average: " + answer);
        return answer;
    }
}
