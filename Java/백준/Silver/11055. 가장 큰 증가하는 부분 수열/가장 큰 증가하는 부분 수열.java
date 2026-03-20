import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        long[] arr = new long[n+1];
        long[] dp = new long[n+1];
        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        // 
        long max = 0;
        dp[1] = arr[1];
        for(int i =2; i <= n; i++){
            dp[i] = arr[i];
            for(int j = 1; j <=n; j++){
                if(j < i && arr[j] < arr[i]){
                    dp[i] = Math.max(dp[i], dp[j] + arr[i]);
                }
            }
        }
        for(int i = 1; i <=n; i++){
            max = Math.max(dp[i], max);
        }
        bw.write(String.valueOf(max));
        bw.newLine();
    
        bw.flush();

    }
}
