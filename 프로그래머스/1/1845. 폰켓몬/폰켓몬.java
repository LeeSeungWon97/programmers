import java.util.ArrayList;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        ArrayList<Integer> kinds = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(!kinds.contains(nums[i])){
                kinds.add(nums[i]);
            }
        }
        answer = kinds.size() > nums.length/2 ? nums.length/2 : kinds.size();
        return answer;
    }
}