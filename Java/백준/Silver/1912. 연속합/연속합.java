import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int idx = 1;
        while(st.hasMoreTokens()){
            dp[idx] = Integer.parseInt(st.nextToken());
            idx+=1;
        }
        dp[0] = 0;
        int answer = Integer.MIN_VALUE;
        for(int i = 1; i <= n; i++){
            dp[i] = Math.max(dp[i],dp[i]+dp[i-1]);
            
            if(answer < dp[i]){
                answer = dp[i];
            }

        }

        bw.write(String.valueOf(answer));
        bw.newLine();
        bw.flush();
        
        br.close();
        bw.close();
    }   
}   
