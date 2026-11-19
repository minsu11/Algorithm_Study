import java.util.*;
import java.io.*;
class Solution
{
    static int min;
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

		for(int test_case = 1; test_case <= T; test_case++)
		{
            min = Integer.MAX_VALUE;
			String[] str = br.readLine().split(" ");
            int n = Integer.parseInt(str[0]);
            int target = Integer.parseInt(str[1]);
            int[] arr = new int[n];
            int answer = Integer.MAX_VALUE;
            str = br.readLine().split(" ");
            for(int i = 0; i < n; i++){
            	arr[i] = Integer.parseInt(str[i]);
            }
            dfs(arr, 0, 0, target);

            System.out.println("#"+ test_case+" " +min);
			
		}
	}
    
    public static void dfs(int[] arr, int sum, int idx, int target){
    	if(target <= sum){        	
            min = Math.min(sum - target, min );
            return;
        }
        if(idx == arr.length){
        	return;
        }
        dfs(arr,sum+arr[idx], idx+1, target);
		dfs(arr,sum,idx+1,  target);

        
    
    }
    
}