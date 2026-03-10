import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.util.*;
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        int[] arr = new int[testCase];
        for(int i =0; i < testCase; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int i = 0; i < arr.length; i++){
            int[] dp = new int[arr[i]+1];
            dp[0] = 1;
            for(int j = 0; j <arr[i]; j++){
                dp[j+1] += dp[j] ;
                if(j+2 <= arr[i]){
                    dp[j+2] += dp[j] ; 
                }
                if(j+3 <= arr[i]){
                    dp[j+3] += dp[j] ;
                }
            }
            

            bw.write(String.valueOf(dp[arr[i]]));
            bw.newLine();
            
        }
        bw.flush();

        
        
    }

    
}