import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n+1];
        int[] arr = new int[n+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            dp[i] = 1;
        }
        
        dp[0] = 0;
        int answer =0;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <i; j++){
                if(arr[i] > arr[j]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
            answer = Math.max(answer,dp[i]);
        }

        bw.write(String.valueOf(answer));
        bw.newLine();
        bw.flush();
        
        br.close();
        bw.close();
    }   
}   
