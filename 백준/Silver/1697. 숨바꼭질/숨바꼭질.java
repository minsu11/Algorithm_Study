import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long num1 = Long.parseLong(st.nextToken());
            long num2 = Long.parseLong(st.nextToken());
            Queue<Long> queue = new LinkedList<>();
            Map<Long, Integer> map = new HashMap<>(); // 이동 횟수를 기록하는 맵

            if (num1 == num2) {
                System.out.println(0);
                return;
            }
            if (num1 > num2) {
                System.out.println(num1 - num2);
                return;
            }

            // BFS 초기화
            queue.add(num1);
            map.put(num1, 0);  // 시작점 이동 횟수는 0

            while (!queue.isEmpty()) {
                long num = queue.poll();
                int steps = map.get(num); // 현재 위치까지의 이동 횟수

                // 도착한 경우
                if (num == num2) {
                    System.out.println(steps);
                    return;
                }

                // 가능한 이동 경로 탐색
                if (!map.containsKey(num - 1) && num > 0) {
                    queue.add(num - 1);
                    map.put(num - 1, steps + 1);
                }
                if (!map.containsKey(num + 1) && num < num2) {
                    queue.add(num + 1);
                    map.put(num + 1, steps + 1);
                }
                if (!map.containsKey(num * 2) && num < num2 * 2) {
                    queue.add(num * 2);
                    map.put(num * 2, steps + 1);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
