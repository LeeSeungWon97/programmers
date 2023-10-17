class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        System.out.println("변환될 문자 = " + s);
        for (char c : s.toCharArray()) {
            int cnt = 1;
            while (cnt <= index) {
                c++;
                if (c > 'z') {
                    c = 'a';
                }
                if (!skip.contains(String.valueOf(c))) {
                    cnt++;
                }
            }
            answer.append(c);
        }
        System.out.println("변환된 문자 = " + answer.toString());
        return answer.toString();
    }
}