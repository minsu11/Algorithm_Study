import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        long[] dp = new long[testCase + 1];
        dp[0] = 1L;
        dp[1] = 1L;
        for (int j = 2; j <= testCase; j++) {
            dp[j] = (dp[j-1] + dp[j-2]) % 10007;
        }

        bw.write(String.valueOf(dp[testCase]));
        bw.newLine();

        bw.flush();

    }

}