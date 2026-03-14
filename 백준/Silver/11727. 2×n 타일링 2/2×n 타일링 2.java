import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] dp = new int[n + 1];

        dp[1] = 1;
        if (n == 1) {
            bw.write(String.valueOf(1));
            bw.flush();
            return;
        }
        dp[2] = 3;
        // 1, 2, 3, 
                
        for (int i = 3; i <= n; i++) {
            dp[i] =(dp[i - 1] + 2*dp[i - 2]) % 10007;
        }
        

        bw.write(String.valueOf(dp[n]));
        bw.newLine();
        bw.flush();

    }
}
