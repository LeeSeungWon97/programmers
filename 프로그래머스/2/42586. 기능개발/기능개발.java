import java.util.*;

class Solution {

    public static final  int MAX_VALUE = 100;

    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < progresses.length; i++) {
            int needDate = calcDate(progresses[i], speeds[i]);
            queue.offer(needDate);
        }
        List<Integer> needDays = new ArrayList<>();
        while (!queue.isEmpty()) {
            int cnt = 0;
            int frontNum = queue.peek();
            queue.poll();
            cnt++;
            if (!queue.isEmpty()) {
                while (queue.peek() <= frontNum) {
                    queue.poll();
                    cnt++;
                    if (queue.isEmpty()) {
                        break;
                    }
                }
            }
            needDays.add(cnt);
        }
        int[] answer = listToIntArray(needDays);
        return answer;
    }

    private int calcDate(int progress, int speed) {
        return (MAX_VALUE - progress) % speed == 0 ? (MAX_VALUE - progress) / speed : (MAX_VALUE - progress) / speed + 1;
    }

    private int[] listToIntArray(List<Integer> list) {
        int[] array = new int[list.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = list.get(i);
        }
        return array;
    }
}