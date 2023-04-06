import java.util.HashMap;

public class Solution {

    /*
        개미 군단이 사냥을 나가려고 합니다. 개미군단은 사냥감의 체력에 딱 맞는 병력을 데리고 나가려고 합니다.
        장군개미는 5의 공격력을, 병정개미는 3의 공격력을 일개미는 1의 공격력을 가지고 있습니다.
        예를 들어 체력 23의 여치를 사냥하려고 할 때, 일개미 23마리를 데리고 가도 되지만, 장군개미 네 마리와 병정개미 한 마리를 데리고 간다면 더 적은 병력으로 사냥할 수 있습니다.
        사냥감의 체력 hp가 매개변수로 주어질 때, 사냥감의 체력에 딱 맞게 최소한의 병력을 구성하려면 몇 마리의 개미가 필요한지를 return하도록 solution 함수를 완성해주세요.
     */
    public int solution01(int hp) {
        int cnt = 0;
        int DAMAGE1 = 5;
        int DAMAGE2 = 3;
        int DAMAGE3 = 1;
        cnt += hp/DAMAGE1;
        hp %= DAMAGE1;
        cnt += hp/DAMAGE2;
        hp %= DAMAGE2;
        cnt += hp/DAMAGE3;
        System.out.println("필요한 마리 수: " + cnt);
        return cnt;
    }

    /*
        머쓱이는 친구에게 모스부호를 이용한 편지를 받았습니다.
        그냥은 읽을 수 없어 이를 해독하는 프로그램을 만들려고 합니다.
        문자열 letter가 매개변수로 주어질 때, letter를 영어 소문자로 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.
        모스부호는 다음과 같습니다.
        morse = {
            '.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f',
            '--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l',
            '--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r',
            '...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x',
            '-.--':'y','--..':'z'
        }
     */
    public String solution02(String letter) {
        HashMap<String,String> morseList = new HashMap<>(){{
           put(".-","a");
           put("-...","b");
           put("-.-.","c");
           put("-..","d");
           put(".","e");
           put("..-.","f");
           put("--.","g");
           put("....","h");
           put("..","i");
           put(".---","j");
           put("-.-","k");
           put(".-..","l");
           put("--","m");
           put("-.","n");
           put("---","o");
           put(".--.","p");
           put("--.-","q");
           put(".-.","r");
           put("...","s");
           put("-","t");
           put("..-","u");
           put("...-","v");
           put(".--","w");
           put("-..-","x");
           put("-.--","y");
           put("--..","z");
        }};
        String[] morse = letter.split(" ");
        String answer = "";
        for (int i = 0; i < morse.length; i++) {
            answer += morseList.get(morse[i]);
        }
        System.out.println("answer: " + answer);
        return answer;
    }

    /*
        가위는 2 바위는 0 보는 5로 표현합니다.
        가위 바위 보를 내는 순서대로 나타낸 문자열 rsp가 매개변수로 주어질 때,
        rsp에 저장된 가위 바위 보를 모두 이기는 경우를 순서대로 나타낸 문자열을 return하도록 solution 함수를 완성해보세요.
     */
    public String solution03(String rsp) {
        String answer = "";
        for(int i = 0; i<rsp.length();i++){
            char ch = rsp.charAt(i);
            switch (ch){
                case '2':
                    answer += '0';
                    break;
                case '0':
                    answer += '5';
                    break;
                case '5':
                    answer += '2';
                    break;
            }
        }
        System.out.println("answer: " + answer);
        return answer;
    }

    /*
        머쓱이는 구슬을 친구들에게 나누어주려고 합니다.
        구슬은 모두 다르게 생겼습니다.
        머쓱이가 갖고 있는 구슬의 개수 balls와 친구들에게 나누어 줄 구슬 개수 share이 매개변수로 주어질 때,
        balls개의 구슬 중 share개의 구슬을 고르는 가능한 모든 경우의 수를 return 하는 solution 함수를 완성해주세요.
     */
    public int solution04(int balls, int share) {
        int answer = 0;
        answer = combination(balls,share);
        System.out.println("answer: " + answer);
        return answer;
    }
    public int combination(int n, int r){
        if(r == 0 || r == n){
            return 1;
        } else{
            return combination(n-1,r-1) + combination(n-1,r);
        }
    }
}
