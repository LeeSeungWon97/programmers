import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        if (cacheSize == 0) {
            return cities.length * 5;
        }
        int totalTime = 0;
        Queue<String> cache = new LinkedList<>();
        for (String city : cities) {
            String cityName = city.toLowerCase();
            if (cache.contains(cityName)) {
                cache.remove(cityName);
                cache.offer(cityName);
                totalTime += 1;
            } else {
                if (cache.size() >= cacheSize) {
                    cache.poll();
                }
                cache.offer(cityName);
                totalTime += 5;
            }
        }
        return totalTime;
    }
}