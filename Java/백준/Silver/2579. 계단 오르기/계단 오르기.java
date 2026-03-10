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

        int[] dp = new int[testCase + 1];
        int[] score = new int[testCase+1];
        for (int i = 1; i <= testCase; i++) {
            score[i] = Integer.parseInt(br.readLine());
        }
        // 2칸 이거나 1칸 
        if (testCase == 1) {
            System.out.println(score[1]);
            return;
        }
        dp[1] = score[1];
        dp[2] = score[1] + score[2];
        for (int i = 3; i <= testCase; i++) {
            dp[i] = Math.max(dp[i-2] + score[i], 
                dp[i-3] + score[i-1] + score[i]
            );
        }


        bw.write(String.valueOf(dp[testCase]));
        bw.newLine();

        bw.flush();

    }

}