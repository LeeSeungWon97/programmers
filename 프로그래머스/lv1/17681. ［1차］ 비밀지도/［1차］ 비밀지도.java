class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i=0; i<arr1.length;i++){
            answer[i] = "";
            String num1 = String.format("%"+n+"s",Integer.toBinaryString(arr1[i]));
            String num2 = String.format("%"+n+"s",Integer.toBinaryString(arr2[i]));
            for(int j=0;j<n;j++){
                if(num1.charAt(j) == '1' || num2.charAt(j) == '1'){
                    answer[i] += "#";
                }else{
                    answer[i] += " ";
                }
            }
        }
        return answer;
    }
}