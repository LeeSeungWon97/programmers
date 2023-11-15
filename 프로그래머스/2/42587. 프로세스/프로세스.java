import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Info> queue = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            queue.add(new Info(i, priorities[i]));
        }
        while (!queue.isEmpty()) {
            Info currnetInfo = queue.poll();
            boolean canPoll = true;

            for (Info info : queue) {
                if (currnetInfo.priority < info.priority) {
                    canPoll = false;
                    break;
                }
            }

            if (canPoll) {
                answer++;
                if (currnetInfo.location == location) {
                    break;
                }
            } else {
                queue.add(currnetInfo);
            } 
        }
        return answer;
    }
    
    class Info {
        int location;
        int priority;

        public Info(int location, int priority) {
            this.location = location;
            this.priority = priority;
        }
    }
}