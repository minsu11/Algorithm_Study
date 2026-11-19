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
			int[][] board =new int[4][4];
            Set<Integer> set = new HashSet<>();
            for(int i = 0; i < 4; i++){
            	String[] str = br.readLine().split(" ");
                for(int j =0; j < 4; j++){
                	board[i][j] = Integer.parseInt(str[j]);
                }
            }
            
            int[] dirX = {1, 0, -1, 0};
            int[] dirY = {0,1,0,-1};
            Deque<int[]> dq= new ArrayDeque<>();
            
            for(int i =0; i < 4; i++){
            	for(int j = 0; j < 4; j++){
                	// 시작 부분
            		dq.add(new int[]{i, j, 1, board[i][j]});        
                    while(!dq.isEmpty()){
                    	int[] value = dq.poll();
                      	int cnt = value[2];
                        if(cnt == 7){
                        	set.add(value[3]);
                            continue;
                        }
                        
                        for(int k = 0; k < 4; k++){
                        	int newX = value[0] + dirX[k];
                            int newY = value[1] + dirY[k];
                            
                            if(newX <0 || newX >=4 || newY <0 || newY>=4){
                            	continue;
                            }
                            dq.add(new int[]{newX, newY, cnt+1, value[3] * 10 + board[newX][newY]});
                            
                        }
                    }   
                }
            }
            System.out.println("#"+test_case+" " + set.size());
            
			
            
        
        }
	}
}