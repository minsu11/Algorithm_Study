
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strArr = br.readLine().split(" ");
        int n = Integer.parseInt(strArr[0]);
        int limitWeight = Integer.parseInt(strArr[1]);
        int[][] dp = new int[n + 1][limitWeight + 1];
        int[][] item = new int[n][2];
        for (int i = 0; i < n; i++) {
            strArr = br.readLine().split(" ");
            int idx = Integer.parseInt(strArr[0]);
            int value = Integer.parseInt(strArr[1]);
            item[i][0] = idx;
            item[i][1] = value;
        }
        for (int i = 1; i <= n; i++) {
            int w = item[i - 1][0];
            int v = item[i - 1][1];

            for (int j = 1; j <= limitWeight; j++) {
                if (w > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    // 현재 물건을 선택하지 않는 경우
                    int notSelect = dp[i - 1][j];

                    // 현재 물건을 선택하는 경우
                    int select = v + dp[i - 1][j - w];

                    dp[i][j] = Math.max(notSelect, select);
                }
            }

        }
        System.out.println(dp[n][limitWeight]);
    }

}
