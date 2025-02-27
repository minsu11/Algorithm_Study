class Solution {
    public int solution(long num) {
        int cnt = 0;
        for( ; cnt < 500; cnt++){
            if(num == 1){
                break;
            }
            
            if(num % 2==0){
                num /=2;
            }
            else{
                num = (num *3 )+1;
            }
        
        }
        
        
        
        return num == 1 ? cnt: -1;
    }
   
}