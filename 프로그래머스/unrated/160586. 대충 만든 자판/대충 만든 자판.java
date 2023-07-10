import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        HashMap<Character, Integer> key = new HashMap<>();
        for(int i=0; i<keymap.length; i++){
            for(int j=0; j<keymap[i].length();j++){
                Character ch = keymap[i].charAt(j);
                if(key.containsKey(ch)){
                    if(j+1<key.get(ch)){
                        key.put(ch,j+1);
                    }
                }else {
                    key.put(ch,j+1);
                }
            }
        }
        for(int i=0; i< targets.length;i++){
            for(int j=0; j<targets[i].length();j++){
                if(key.containsKey(targets[i].charAt(j))){
                    answer[i] += key.get(targets[i].charAt(j));
                }else {
                    answer[i] = -1;
                    break;
                }
            }
        }
        return answer;
    }
}