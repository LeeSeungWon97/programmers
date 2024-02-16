import java.util.HashSet;

/**
 * 1. 왔던 길을 중복 처리 -> HashSet 사용
 * 2. 이동 경로 처리 -> 현재 좌표 + 이동한 좌표를 String으로 처리 (0,0)->(1,0) => "0010"
 * 3. (0,0)->(1,0) 이동경로는 (1,0)->(0,0) 이동경로와 동일 => Up,Right : 현재좌표 + 이동좌표 , Down, Left: 이동좌표 + 현재좌표로 처리
 * 4. 좌표평면을 넘어가는 경우 무시 -> 반복문 continue 처리
 * 5. 처음 걸어본 길의 길이 -> 반복문이 끝난 후 HashSet의 size 계산
 */
class Solution {
    public int solution(String dirs) {
        // 지나간 경로 저장
        HashSet set = new HashSet();

        // 현재 캐릭터 좌표 저장
        int nowX = 0;
        int nowY = 0;

        // 이동 경로
        for (int i = 0; i < dirs.length(); i++) {
            // 이동한 경로 좌표를 저장
            int nextX = nowX;
            int nextY = nowY;
            // 이동할 방향을 저장
            char dir = dirs.charAt(i);
            // 이동 경로 저장
            String path = "";
            switch (dir) {
                case 'U': // (0,0) -> (0,1)
                    nextY++;
                    path += nowX;
                    path += nowY;
                    path += nextX;
                    path += nextY;
                    break;
                case 'R': // (0,0) -> (1,0)
                    nextX++;
                    path += nowX;
                    path += nowY;
                    path += nextX;
                    path += nextY;
                    break;
                case 'D': // (0,1) -> (0,0)
                    nextY--;
                    path += nextX;
                    path += nextY;
                    path += nowX;
                    path += nowY;
                    break;
                case 'L': // (1,0) -> (0,0)
                    nextX--;
                    path += nextX;
                    path += nextY;
                    path += nowX;
                    path += nowY;
                    break;
            }
            // 이동한 좌표가 넘어간 경우
            if (nextX > 5 || nextX < -5 || nextY > 5 || nextY < -5) {
                continue;
            } else {
                set.add(path); // 이동 경로 저장
                // 현재 좌표 업데이트
                nowX = nextX;
                nowY = nextY;
            }
        }
        return set.size();
    }
}