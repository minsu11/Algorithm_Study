import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[][] dp = new int[n+1][n+1];
        
        for(int i = 1; i <= n; i++){
            st= new StringTokenizer(br.readLine());
            int idx = 1;
            while(st.hasMoreTokens()){
                dp[i][idx] = Integer.parseInt(st.nextToken());
                idx+=1;
            }

            for(int j = idx; j <=n ;j++){
                dp[i][j] = -1;
            }
        }
        if(n == 1){
            bw.write(String.valueOf(dp[1][1]));
            bw.newLine();
            bw.flush();
            return;
        }

        int max = 0;
        for(int i = 2; i <=n ; i++){
            for(int j = 1; j <=n ; j++){
                if(dp[i][j] <0){
                    break;
                }
                dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-1]) + dp[i][j];
                max = Math.max(dp[i][j], max);
            }

            

        }
        bw.write(String.valueOf(max));
        bw.newLine();
    
        bw.flush();

    }
}
