import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		int T = Integer.parseInt(br.readLine());
	

		for(int test_case = 1; test_case <= T; test_case++)
		{
			// 마름모 value
            int n = Integer.parseInt(br.readLine());
            int[][] board = new int[n][n];
            for(int i = 0; i < n; i++){
            	String[] str = br.readLine().split("");
                for(int j = 0; j < n; j++){
                	board[i][j] = Integer.parseInt(str[j]);
                }
            }
            int answer =0;
            int start = n/2;
            for(int i = 0; i <= n/2; i++){
            	for(int j = start-i; j <= start+i; j++){
                	answer+=board[i][j];
                }
            }
            int m = 1;
            for(int i = n/2 +1; i < n; i++){
            	for(int j = m; j < n-m; j++){
                	answer+=board[i][j];
                }
                m+=1;
            }
            System.out.println("#"+test_case+" "+answer);

            
		}
	}
}