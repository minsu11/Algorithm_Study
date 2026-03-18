import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        long[][] arr = new long[n+1][10];
        long[] dp = new long[n+1];
        /*
        1일떄
        0   1   2   3   4   5   6   7   8   9
        1   1   1   1   1   1   1   1   1   1 -> 10
        2일떄
        10  9   8   7   6   5   4   3   2   1 -> 55
        3
        55  45  36  28  21  15  10  6   3   1   
               */
        for(int i = 0; i < 10; i++){
            arr[1][i] = 1;
        }
        
        dp[1] = 10;
        for(int i= 2; i<=n; i++){
            arr[i][9] = 1;
            long sum = arr[i][9];
            for(int j = 8  ; j >= 0; j--){
                arr[i][j] = (arr[i-1][j] + arr[i][j+1])% 10007;
                sum = (sum + arr[i][j])% 10007;
            }
            dp[i] = sum ;
        }
        bw.write(String.valueOf(dp[n]));
        bw.newLine();
    
        bw.flush();

    }
}
