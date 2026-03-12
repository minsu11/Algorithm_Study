import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] dp = new int[k + 1];
        int[][] arr = new int[n+1][2];
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        for(int i = 1; i <=n; i++){
            int weight = arr[i][0];
            int value = arr[i][1];

            for(int j = k; j >=weight; j--){
                dp[j] = Math.max(dp[j], dp[j-weight] + value);
            }
        }

        bw.write(String.valueOf(dp[k]));
        bw.newLine();
        bw.flush();

    }
}
