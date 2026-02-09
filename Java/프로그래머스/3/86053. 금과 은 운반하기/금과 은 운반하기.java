import java.util.*;

class Solution {

    public long solution(int a, int b, int[] g, int[] s, int[] w, int[] t) {
        long A = a, B = b;

        // 1) 상한(hi) 찾기: ok(hi) 될 때까지 2배
        long lo = 0L;
        long hi = 1L;
        while (!can(hi, A, B, g, s, w, t)) {
            hi *= 2L;
        }

        // 2) 이분 탐색: 최소 시간 찾기
        while (lo < hi) {
            long mid = (lo + hi) / 2L;
            if (can(mid, A, B, g, s, w, t)) {
                hi = mid;
            } else {
                lo = mid + 1L;
            }
        }

        return lo;
    }

    private boolean can(long time, long a, long b, int[] g, int[] s, int[] w, int[] t) {
        long sumGold = 0L;
        long sumSilver = 0L;
        long sumTotal = 0L;

        for (int i = 0; i < g.length; i++) {
            long round = time / (2L * t[i]);
            long rem = time % (2L * t[i]);
            long trips = round + (rem >= t[i] ? 1L : 0L);

            long cap = trips * (long) w[i];                // 이 도시에서 옮길 수 있는 총량(무게)
            sumGold += Math.min((long) g[i], cap);         // 금만 최대한
            sumSilver += Math.min((long) s[i], cap);       // 은만 최대한
            sumTotal += Math.min((long) g[i] + s[i], cap); // 금+은 합쳐서 최대한
        }

        return sumGold >= a && sumSilver >= b && sumTotal >= (a + b);
    }
}
