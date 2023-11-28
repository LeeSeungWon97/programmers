import java.util.ArrayList;
import java.util.List;

class Solution {
    String[] vowels = {"A", "E", "I", "O", "U"};

    public int solution(String word) {
        List<String> words = new ArrayList<>();
        String str = "";
        getWords(words, str);
        return words.indexOf(word);
    }

    private void getWords(List<String> words, String str) {
        words.add(str);
        if (str.length() == 5) {
            return;
        }
        for (int i = 0; i < vowels.length; i++) {
            getWords(words, str + vowels[i]);
        }
    }
}
