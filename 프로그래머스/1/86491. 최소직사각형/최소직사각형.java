class Solution {
    public int solution(int[][] sizes) {
    
        int answer = 0;
        int x = 0;
        int y = 0;
        
        for(int i = 0; i < sizes.length; i++){
            int num1 = sizes[i][0];
            int num2 = sizes[i][1];
            
            if(num1 < num2){
                int tmp = num1;
                num1 = num2;
                num2 = tmp;
            }
            
            if(x < num1 ){
                x = num1;
            }
            
            if(y < num2 ){
                y = num2;
            }
        }
        
        return x*y;
    }
}