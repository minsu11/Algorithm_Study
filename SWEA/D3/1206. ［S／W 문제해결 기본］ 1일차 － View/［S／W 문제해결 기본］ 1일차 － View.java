import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T;
		T=10;

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int left = 0;
            int right = 0;
            int n = Integer.parseInt(br.readLine());
            String[] str= br.readLine().split(" ");
            int[] building = new int[n];
            for(int i = 0; i < n; i++){
            	building[i] = Integer.parseInt(str[i]);
            }
            int answer = 0;
            for(int i = 2; i < n-2; i++){
            	left = Math.max(building[i-2], building[i-1]);
                right = Math.max(building[i+2], building[i+1]);
                int num = Math.max(left, right);
                if(num > building[i]){
                	continue;
                }
                answer += building[i] - num;
                
            }
            
            System.out.println("#" + test_case +" " +answer);
            
            
		}
	}
}