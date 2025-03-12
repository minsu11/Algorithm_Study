import java.util.*;
import java.lang.*;
class Solution {
    public int solution(String dartResult) {
        int answer = 0;

        int value = 0;
        String[] dart = dartResult.split("");
        int[] result = new int[3];
        int idx=0;
        String s = "";
        for(String d : dart){
            if(d.equals("*")){
                if(idx -1 != 0){
                    result[idx - 2] = result[idx-2] *2; 
                }
                
                result[idx-1 ] = result[idx-1] * 2;
                continue;
            }else if(d.equals("#")){
                
                result[idx -1 ] = -result[idx-1];
                continue;
            }
            
            if(!d.equals("S") && !d.equals("D")  && !d.equals("T")){
                s = s+d;
                continue;
            }
            
            int data = 0;
            if(d.equals("S")){
                data = 1;
            }else if(d.equals("D")){
                data = 2;
            }
            else if(d.equals("T")){
                data = 3;
            }
            result[idx] = (int)Math.pow(Integer.parseInt(s), data);
            idx++;
            s= "";
        }
        
        for(int n: result){
            answer+=n;
        }
        return answer;
    }
}