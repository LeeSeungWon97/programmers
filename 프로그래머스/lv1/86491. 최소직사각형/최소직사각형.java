class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int xMax = 1;
        int yMax = 1;
        for(int i=0; i<sizes.length;i++){
            for(int j=0; j<sizes[i].length;j++){
                if(sizes[i][1]>sizes[i][0]){
                    int temp = sizes[i][0];
                    sizes[i][0] = sizes[i][1];
                    sizes[i][1] = temp;
                }
                if(sizes[i][0] > xMax){
                    xMax = sizes[i][0];
                }
                if(sizes[i][1] > yMax){
                    yMax = sizes[i][1];
                }
            }
        }
        answer = xMax*yMax;
        return answer;
    }
}