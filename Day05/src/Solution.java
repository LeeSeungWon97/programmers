import java.util.Arrays;

public class Solution {
    /*
        머쓱이네 옷가게는 10만 원 이상 사면 5%, 30만 원 이상 사면 10%, 50만 원 이상 사면 20%를 할인해줍니다.
        구매한 옷의 가격 price가 주어질 때, 지불해야 할 금액을 return 하도록 solution 함수를 완성해보세요.
     */
    public int solution01(int price) {
        if(price >= 500000){
            price *= 0.8;
        } else if(price >= 300000){
            price *= 0.9;
        } else if(price >= 100000){
            price *= 0.95;
        }
        int payment = price;
        System.out.println("payment: " + payment);
        return payment;
    }
    /*
        머쓱이는 추운 날에도 아이스 아메리카노만 마십니다.
        아이스 아메리카노는 한잔에 5,500원입니다. 머쓱이가 가지고 있는 돈 money가 매개변수로 주어질 때,
        머쓱이가 최대로 마실 수 있는 아메리카노의 잔 수와 남는 돈을 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
     */
    public int[] solution02(int money) {
        int[] answer = new int[2];
        int count = money / 5500;
        int change = money - 5500*count;
        answer[0] = count;
        answer[1] = change;
        System.out.println("answer[]: " + Arrays.toString(answer));
        return answer;
    }
    /*
        머쓱이는 40살인 선생님이 몇 년도에 태어났는지 궁금해졌습니다.
        나이 age가 주어질 때, 2022년을 기준 출생 연도를 return 하는 solution 함수를 완성해주세요.
     */
    public int solution03(int age) {
        int year = 2022;
        int birth = year - age + 1;
        System.out.println("birth: " + birth);
        return birth;
    }
    /*
        정수가 들어 있는 배열 num_list가 매개변수로 주어집니다.
        num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록 solution 함수를 완성해주세요.
     */
    public int[] solution04(int[] num_list) {
        int[] answer = num_list;
        int length = answer.length;
        for(int i=0;i< length/2;i++){
            int temp = answer[i];
            answer[i] = answer[length-(i+1)];
            answer[length-(i+1)] = temp;
        }
        System.out.println("answer[]: " + Arrays.toString(answer));
        return answer;
    }
}
