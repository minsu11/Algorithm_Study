import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int inputCase = Integer.parseInt(st.nextToken());
    
        for(int i = 0; i < inputCase; i++){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int[][] dp = new int[2][n+1];
            int[][] arr = new int[2][n+1];
            for(int j = 0; j < 2; j++){
                st = new StringTokenizer(br.readLine());
                for(int k = 1; k <= n; k++){
                    arr[j][k] = Integer.parseInt(st.nextToken());
                }
            }
            dp[0][1] = arr[0][1];
            dp[1][1] = arr[1][1];
            int max = 0;
            for(int j = 2; j <=n ;j++){
                // 위 
                dp[0][j] = Math.max(dp[0][j], dp[1][j-1] + arr[0][j]);

                // 아래
                dp[1][j] = Math.max(dp[1][j] , dp[0][j-1] + arr[1][j]);

                // 선택 안함
                if(j < n){
                    dp[0][j+1] = Math.max(dp[0][j-1], dp[1][j-1]) + arr[0][j+1];
                    dp[1][j+1] = Math.max(dp[0][j-1], dp[1][j-1]) + arr[1][j+1];
                }

            }

            for(int j = 1; j <=n; j++){
                max = Math.max(max, Math.max(dp[0][j], dp[1][j]));
            }

            bw.write(String.valueOf(max));
            bw.newLine();
        }
        
        bw.flush();

    }
}
