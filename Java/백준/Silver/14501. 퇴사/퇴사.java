import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] dp = new int[n+2];
        int[] value = new int[n+1];
        int[] condition = new int[n+1];
        for(int i = 1; i <= n; i++){
            st= new StringTokenizer(br.readLine());
            condition[i] = Integer.parseInt(st.nextToken());
            value[i] = Integer.parseInt(st.nextToken());
        }
        for(int i = 1; i <= n; i++){
            // 기준 점
            int num = i + condition[i];
            if(num <= n+1 ){
                dp[num] = Math.max(dp[num], dp[i]+value[i]);
            }
            dp[i+1] = Math.max(dp[i], dp[i+1]);
    
        }

        
        bw.write(String.valueOf(dp[n+1]));
        bw.newLine();
    
        bw.flush();

    }
}
