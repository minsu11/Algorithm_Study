import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        for (int i = 0; i < x; i++) {
            int n = Integer.parseInt(br.readLine());

            long[] dp = new long[n + 1];
            if(n < 4){

                bw.write(String.valueOf(1));
                bw.newLine();
                continue;
            }
            dp[1] = 1;
            dp[2] = 1;
            dp[3] = 1;

                
            for (int j = 4; j <= n; j++) {
                dp[j] = dp[j - 3] + dp[j - 2];
            }
            bw.write(String.valueOf(dp[n]));
            bw.newLine();
        }
        
        
        bw.flush();

    }
}
