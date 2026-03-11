import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 0;
        for(int i = 2; i <=n; i++){
            int num1 = Integer.MAX_VALUE;
            int num2 = Integer.MAX_VALUE;
            if(i % 2 == 0){
                num1 = dp[i/2];
            }
            if(i% 3 == 0){
                num2 = dp[i/3];
            }
            dp[i] = Math.min(dp[i-1], Math.min(num1, num2))+1;
        }
        
        bw.write(String.valueOf(dp[n]));
        bw.newLine();
        bw.flush();

    }   
}   
