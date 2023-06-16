class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean[] check = new boolean[n+1];
        for(int i=2; i<=n; i++){
            check[i] = true;
        }
        for(int i=2; i<Math.sqrt(n);i++){
            if(check[i]==true){
                for(int j=i; j*i<=n; j++){
                    check[j*i] = false;
                }
            }
        }
        for(int i=2; i<=n; i++){
            if(check[i]==true){
                answer++;
            }
        }
        return answer;
    }
}