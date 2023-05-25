import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution {
    public int solution01(String A, String B){
        int answer = 0;
        String copy = A;
        for(int i = 0; i< A.length(); i++){
            if(copy.equals(B)){
                System.out.println("answer: " + answer);
                return answer;
            }
            String a = copy.substring(copy.length()-1);
            copy = a + copy.substring(0,copy.length()-1);
            answer++;
        }
        System.out.println("answer: -1");
        return -1;
    }

    public int solution02(int M, int N) {
        int answer = 0;
        answer = (M-1) + (N-1)*M;
        System.out.println("answer: " + answer);
        return answer;
    }

    public int[] solution03(int num, int total) {
        int[] answer = new int[num];
        int start = (2*total+num-(num*num))/(2*num);
        System.out.println("start: " + start);
        for(int i=0;i<num;i++){
            answer[i] = start+i;
        }
        System.out.println("answer[]: " + Arrays.toString(answer));
        return answer;
    }

    public int solution04(int[] common) {
        int answer = 0;
        int d1 = common[1]-common[0];
        int d2 = common[2]-common[1];
        if(d1==d2){
            answer = common[common.length-1] + d1;
        } else{
            int r = d2/d1;
            answer = common[common.length-1] * r;
        }
        System.out.println("answer: " + answer);
        return answer;
    }
}
