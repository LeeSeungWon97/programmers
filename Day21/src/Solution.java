import java.util.Arrays;

public class Solution {

    /*
        문자열 my_string이 매개변수로 주어집니다.
        my_string은 소문자, 대문자, 자연수로만 구성되어있습니다. my_string안의 자연수들의 합을 return하도록 solution 함수를 완성해주세요.
     */
    public int solution01(String my_string) {
        int answer = 0;
        String[] str = my_string.split("[a-zA-Z]");
        for(int i = 0; i<str.length;i++){
            if(!str[i].equals("")){
                answer += Integer.parseInt(str[i]);
            }
        }
        System.out.println("answer: " + answer);
        return answer;
    }
    /*
        다음 그림과 같이 지뢰가 있는 지역과 지뢰에 인접한 위, 아래, 좌, 우 대각선 칸을 모두 위험지역으로 분류합니다.
        지뢰는 2차원 배열 board에 1로 표시되어 있고 board에는 지뢰가 매설 된 지역 1과, 지뢰가 없는 지역 0만 존재합니다.
        지뢰가 매설된 지역의 지도 board가 매개변수로 주어질 때, 안전한 지역의 칸 수를 return하도록 solution 함수를 완성해주세요.
     */
    public int solution02(int[][] board) {
        int answer = 0;
        for(int i = 0; i<board.length;i++){
            for(int j = 0; j<board[0].length;j++){
                if(board[i][j] == 1){
                    danger(i,j,board);
                }
            }
        }
        System.out.println("board[]: " + Arrays.deepToString(board));
        for(int i = 0;i<board.length;i++){
            for(int j = 0; j<board[0].length;j++){
                if(board[i][j] == 0){
                    answer++;
                }
            }
        }
        System.out.println("answer: " + answer);
        return answer;
    }
    private void danger(int x, int y, int[][] board){
        int[] aroundX = {-1,-1,-1,0,0,0,1,1,1};
        int[] aroundY = {-1,0,1,-1,0,1,-1,0,1};
        for(int i = 0; i<9;i++){
            int boomX = x + aroundX[i];
            int boomY = y + aroundY[i];
            if(boomX >= 0 &&  boomY >= 0 && boomX < board.length && boomY < board.length){
                if(board[boomX][boomY] != 1){
                    board[boomX][boomY] = 2;
                }
            }
        }
    }

    /*
        선분 세 개로 삼각형을 만들기 위해서는 다음과 같은 조건을 만족해야 합니다.
            * 가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.
        삼각형의 두 변의 길이가 담긴 배열 sides이 매개변수로 주어집니다. 나머지 한 변이 될 수 있는 정수의 개수를 return하도록 solution 함수를 완성해주세요.
     */
    public int solution03(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        // 다른 한변이 가장 긴 변일 경우
        for(int i = sides[1] + 1; i < sides[0] + sides[1]; i++){
            answer++;
        }
        // 주어진 변 중에 하나가 제일 긴 변인 경우
        for(int i = 1; i <= sides[1]; i++){
            if(sides[0] + i > sides[1]){
                answer++;
            }
        }
        System.out.println("answer: " + answer);
        return answer;
    }

    /*
        PROGRAMMERS-962 행성에 불시착한 우주비행사 머쓱이는 외계행성의 언어를 공부하려고 합니다.
        알파벳이 담긴 배열 spell과 외계어 사전 dic이 매개변수로 주어집니다.
        spell에 담긴 알파벳을 한번씩만 모두 사용한 단어가 dic에 존재한다면 1, 존재하지 않는다면 2를 return하도록 solution 함수를 완성해주세요.
     */
    public int solution04(String[] spell, String[] dic) {
        int answer = 0;
        for(int i = 0; i < dic.length; i++){
            boolean check = true;
            for(int j = 0; j < spell.length;j++){
                if(!dic[i].contains(spell[j])){
                    check = false;
                    break;
                }
            }
            if(check){
                answer = 1;
                break;
            } else {
                answer = 2;
            }
        }
        System.out.println("answer: " + answer);
        return answer;
    }
}
