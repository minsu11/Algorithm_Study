import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
        int T = 10;

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int n = Integer.parseInt(br.readLine());
            int[][] board = new int[100][100];
            int answer = 1;
            for(int i = 0; i < 100; i++){
            	String str = br.readLine();
                for(int j = 0; j < 100; j++){
               		board[i][j] = str.charAt(j) - 'A'; 	
                }
            }
            
            for(int i = 0; i < 100; i++){
            	int end = 99;
                // 가로
                for(int j = 0; j <= 99; j++){
                    for(int k = 99; k >=0; k--){
                    	if (board[i][j] != board[i][k]) {
            				continue;
       					}
                         boolean check = false;
                        int sum = 0;
                        int e = k;
                        for(int start = j; start <= e; start++){
                            if(board[i][start] != board[i][e]){
                                check = true;
                                break;
                            }
                            if(start == e){
                                sum+=1;
                                break;
                            }
                            e-=1;
                            sum+=2;
                        }
                        if(!check){
                            answer = Math.max(answer,sum);
                        }
                    }
                	
                }
            	end = 99;
                for(int j = 0; j <= 99; j++){
                    for(int k = 99; k >=0; k--){
                        if(board[j][i] != board[k][i]){
                            continue;
                        }
                        
                        boolean check = false;
                        int sum = 0;
                        int e = k;
                        for(int start = j; start <= e; start++){
                            if(board[start][i] != board[e][i]){
                                check = true;
                                break;
                            }
                            if(start == e){
                                sum+=1;
                                break;
                            }
                            e-=1;
                            sum+=2;
                        }
                        if(!check){
                            answer = Math.max(answer,sum);
                        }
                    }
    
                        
                    }
                	
                                    
            }
            
			
            System.out.println("#"+n +" "+answer);
            
		}
	}
}