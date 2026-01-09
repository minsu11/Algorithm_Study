import java.lang.Math;
class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        int[] xArr = new int[10];
        int[] yArr = new int[10];
        int total =0;
        for(char c : X.toCharArray()){
            int i = c - '0';
            xArr[i]++;
        }
        
        for(char c : Y.toCharArray()){
            int i = c - '0';
            yArr[i]++;
        }
        
        for(int i = 9; i>=0; i--){
            total += Math.min(xArr[i],yArr[i] );
        }
        
        if(total ==0){
            return "-1";
        }
        
        boolean onlyZero = true;
        for(int i = 9; i>=1; i--){
            if(Math.min(xArr[i],yArr[i] ) > 0){
                onlyZero = false;
                break;
            }
        }
        
        if(onlyZero){
            return "0";
        }
        
        
        for(int i = 9; i >=0; i--){
            int common = Math.min(xArr[i], yArr[i]);
            for(int j = 0; j < common; j++){
                answer.append(i);
            }
        }
     
        return answer.toString();
    }
}