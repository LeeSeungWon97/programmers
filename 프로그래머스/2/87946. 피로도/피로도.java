class Solution {
    int answer;
    boolean[] visited;

    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        dfs(0, k, dungeons);
        System.out.println("answer = " + answer);
        return answer;
    }

    private void dfs(int depth, int currentFatigue, int[][] dungeons) {
        for (int i = 0; i < visited.length; i++) {
            if (visited[i] || dungeons[i][0] > currentFatigue) {
                continue;
            }
            visited[i] = true;
            dfs(depth + 1, currentFatigue - dungeons[i][1], dungeons);
            visited[i] = false;
        }
        answer = Math.max(answer, depth);
    }
}