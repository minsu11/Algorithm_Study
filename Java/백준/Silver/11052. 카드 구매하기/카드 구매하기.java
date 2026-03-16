import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        long[] dp = new long[n+1];
        st = new StringTokenizer(br.readLine());
        
        for(int i = 1; i <= n; i++){
            dp[i] = Long.parseLong(st.nextToken());
        }

        for(int i = 2; i <= n; i++){
            // 5: 1만 경우, 2, 3
            for(int j = 1; j <= i ; j++){
                dp[i] = Math.max(dp[i], dp[i-j] + dp[j]);
            }

        }

        bw.write(String.valueOf(dp[n]));
        bw.newLine();

        bw.flush();

    }
}
