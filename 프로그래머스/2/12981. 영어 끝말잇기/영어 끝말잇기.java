import java.util.HashSet;

public class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[]{0, 0};
        HashSet<String> usedWord = new HashSet<>();
        int turn = 0;
        char prev = 0;
        for (String word : words) {
            if (turn > 0 && (word.charAt(0) != prev || usedWord.contains(word))) {
                answer[0] = turn % n + 1;
                answer[1] = turn / n + 1;
                break;
            }
            usedWord.add(word);
            prev = word.charAt(word.length() - 1);
            turn++;
        }
        return answer;
    }


}
