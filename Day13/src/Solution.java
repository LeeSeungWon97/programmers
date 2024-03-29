import java.util.Arrays;

public class Solution {

    /*
        숫자와 "Z"가 공백으로 구분되어 담긴 문자열이 주어집니다.
        문자열에 있는 숫자를 차례대로 더하려고 합니다.
        이 때 "Z"가 나오면 바로 전에 더했던 숫자를 뺀다는 뜻입니다.
        숫자와 "Z"로 이루어진 문자열 s가 주어질 때, 머쓱이가 구한 값을 return 하도록 solution 함수를 완성해보세요.
     */
    public int solution01(String s) {
        int answer = 0;
        String[] numbers = s.split(" ");
        int len = numbers.length;
        for(int i = 0; i<len;i++){
            if(numbers[i].equals("Z")){
                answer -= Integer.parseInt(numbers[i-1]);
            }else{
                answer += Integer.parseInt(numbers[i]);
            }
        }
        System.out.println("answer: " + answer);
        return answer;
    }
    /*
        문자열 배열 strlist가 매개변수로 주어집니다.
        strlist 각 원소의 길이를 담은 배열을 retrun하도록 solution 함수를 완성해주세요.
     */
    public int[] solution02(String[] strlist) {
        int len = strlist.length;
        int[] answer = new int[len];

        for(int i = 0; i<len;i++){
            answer[i] = strlist[i].length();
        }
        System.out.println("answer[]: " + Arrays.toString(answer));
        return answer;
    }
    /*
        문자열 my_string이 매개변수로 주어집니다.
        my_string에서 중복된 문자를 제거하고 하나의 문자만 남긴 문자열을 return하도록 solution 함수를 완성해주세요.
     */
    public String solution03(String my_string) {
        String answer = "";
        int len = my_string.length();
        for(int i=0;i<len;i++){
            String ch = Character.toString(my_string.charAt(i));
            if(!answer.contains(ch)){
                answer += ch;
            }
        }
        System.out.println("answer: " + answer);
        return answer;
    }
    /*
        선분 세 개로 삼각형을 만들기 위해서는 다음과 같은 조건을 만족해야 합니다.
            * 가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.
        삼각형의 세 변의 길이가 담긴 배열 sides이 매개변수로 주어집니다.
        세 변으로 삼각형을 만들 수 있다면 1, 만들 수 없다면 2를 return하도록 solution 함수를 완성해주세요.
     */
    public int solution04(int[] sides) {
        int answer = 1;
        Arrays.sort(sides);
        if(!(sides[0] + sides[1] > sides[2])){
            answer = 2;
        }
        System.out.println("answer: " + answer);
        return answer;
    }
}
