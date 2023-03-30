import java.util.Arrays;

public class Solution {

    /*
        정수 num1, num2가 매개변수로 주어질 때, num1를 num2로 나눈 나머지를 return 하도록 solution 함수를 완성해주세요.
     */
    public int solution01(int num1, int num2) {
        int answer = num1 % num2;
        System.out.println("answer: " + answer);
        return answer;
    }

    /*
        중앙값은 어떤 주어진 값들을 크기의 순서대로 정렬했을 때 가장 중앙에 위치하는 값을 의미합니다.
        예를 들어 1, 2, 7, 10, 11의 중앙값은 7입니다. 정수 배열 array가 매개변수로 주어질 때, 중앙값을 return 하도록 solution 함수를 완성해보세요.
     */
    public int solution02(int[] array) {
        int answer = 0;
        int idx = array.length / 2;
        int[] arr = Arrays.stream(array).sorted().toArray();
        answer = arr[idx];
        System.out.println("answer: " + answer);
        return answer;
    }
    /*
        최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다.
        정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록 solution 함수를 완성해보세요.
        최빈값이 여러 개면 -1을 return 합니다.
     */
    public int solution03(int[] array) {
        int answer = 0;
        System.out.println("array[]: " + Arrays.toString(array));
        // 중복값을 제외한 배열
        int[] tempArr = Arrays.stream(array).distinct().toArray();
        System.out.println("tempArr[]: " + Arrays.toString(tempArr));
        // 중복제외 한 배열의 길이가 1인경우
        if(tempArr.length == 1){
            answer = tempArr[0];
            System.out.println("answer: " + answer);
            return answer;
        }
        // 각 요소의 카운트를 저장한 배열
        int[] count = new int[tempArr.length];
        for(int i=0; i< tempArr.length;i++){
            int cnt = 0;
            for( int j=0; j< array.length;j++){
                if(tempArr[i] == array[j]){
                    cnt++;
                }
            }
            count[i] = cnt;
            System.out.println(tempArr[i]+"의 개수: " + count[i]);
        }
        // count가 최대인 index 구하기
        int idx = 0;
        for(int i=0;i<count.length;i++){
            if(count[i] >= count[idx]){
                idx = i;
            }
        }
        answer = tempArr[idx];

        // 최빈값이 같은 경우 확인
        Arrays.sort(count);
        if(count[count.length-1]==count[count.length-2]){
            answer = -1;
        }

        System.out.println("answer: " + answer);

        return answer;
    }

    /*
        정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.
     */
    public int[] solution04(int n) {
        // 배열의 크기 설정
        int len = n/2;
        if(n%2 != 0){
            len++;
        }
        int[] answer = new int[len];
        // 배열의 index값
        int idx = 0;
        for(int i=1;i<n+1;i++){
            if(i%2 !=0){
                answer[idx] = i;
                idx++;
            }
        }
        System.out.println("answer[]: " + Arrays.toString(answer));
        return answer;
    }
}
