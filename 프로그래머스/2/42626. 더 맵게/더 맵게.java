import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue();
        for (int s : scoville) {
            priorityQueue.offer(s);
        }

        while (priorityQueue.peek() < K) {
            int first = priorityQueue.poll();
            int second = priorityQueue.poll();
            int newScovile = first + (second * 2);

            priorityQueue.offer(newScovile);
            answer++;
            if (priorityQueue.size() == 1 && priorityQueue.peek() < K) {
                return -1;
            }
        }

        return answer;
    }
}