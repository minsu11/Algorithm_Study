
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
			String[] strArr = br.readLine().split(" ");
            int changeCnt = Integer.parseInt(strArr[1]);
            
            Map<Integer,Set<String>> map = new HashMap<>();
            Set<String> set = new HashSet<>();
            set.add(strArr[0]);
            map.put(0, set);
            
            for(int i = 1; i <= changeCnt; i++){
            	Set<String> prevSet = map.get(i-1);
                Set<String> curSet = new HashSet<>();
                for(String str : prevSet){
                	for(int j = 0; j < str.length()-1; j++){
                    	for(int k = j+1; k < str.length(); k++){
                    		char[] cArr = str.toCharArray();
                    		char tmp = cArr[j];
                            cArr[j] = cArr[k];
                            cArr[k] = tmp;
                            curSet.add(new String(cArr));
                        }
                    }
                }
                map.put(i, curSet);
                
            }
            
            Set<String> s =map.get(changeCnt);
            int max = Integer.MIN_VALUE;
                
                for(String st : s){
                	max = Math.max(max, Integer.parseInt(st));
                }
            	System.out.println("#"+test_case+" "+max);
            
            
		}
	}
}