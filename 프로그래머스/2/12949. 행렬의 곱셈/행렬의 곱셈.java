class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int row = arr1.length;
        int col1 = arr1[0].length;
        int col2 = arr2[0].length;
        int[][] matrix = new int[row][col2];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col2; j++) {
                int temp = 0;
                for (int k = 0; k < col1; k++) {
                    temp += arr1[i][k] * arr2[k][j];
                }
                matrix[i][j] = temp;
            }
        }
        return matrix;
    }
}