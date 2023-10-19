class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        boolean isFirstChar = true;

        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                if (isFirstChar) {
                    answer.append(Character.toUpperCase(c));
                } else {
                    answer.append(Character.toLowerCase(c));
                }
            } else {
                answer.append(c);
            }
            isFirstChar = false;
            if (Character.isWhitespace(c)) {
                isFirstChar = true;
            }
        }
        System.out.println("answer = " + answer.toString());
        return answer.toString();
    }
}