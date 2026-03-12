import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] dp = new int[n + 1][3];
        int[][] arr = new int[n + 1][3];
        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {

                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int answer = Integer.MAX_VALUE;
        dp[1][0] = arr[1][0];
        dp[1][1] = arr[1][1];
        dp[1][2] = arr[1][2];

        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < 3; j++) {
                dp[i][j] = Math.min(dp[i - 1][(j + 1) % 3] + arr[i][j], dp[i - 1][(j + 2) % 3] + arr[i][j]);
            }
        }

        for (int i = 0; i < 3; i++) {
            answer = Math.min(answer, dp[n][i]);
        }

        bw.write(String.valueOf(answer));
        bw.newLine();
        bw.flush();

        br.close();
        bw.close();
    }
}
