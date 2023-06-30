import java.util.*;
class Solution {
    public int solution(String s) {
        ArrayList<String> splitStr = new ArrayList<>();
        char compare = s.charAt(0);
        int sameCnt = 0;
        int differntCnt = 0;
        int startIdx = 0;
        for(int i=0; i<s.length(); i++) {
            if (s.charAt(i) == compare) {
                sameCnt++;
            } else {
                differntCnt++;
            }
            if (sameCnt == differntCnt) {
                if(i+1 < s.length()){
                    splitStr.add(s.substring(startIdx, i + 1));
                    startIdx = i + 1;
                    compare = s.charAt(i + 1);
                } else {
                    splitStr.add(s.substring(startIdx));
                }

            } else if (i==s.length()-1){
                splitStr.add(s.substring(startIdx));
            }
        }
        return splitStr.size();
    }
}