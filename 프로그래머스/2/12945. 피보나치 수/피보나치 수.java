import java.math.*;
class Solution {
    public int solution(int n) {
        if(n ==0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        
        
        
        
        BigInteger answer = BigInteger.ZERO;
        
        BigInteger x = BigInteger.ZERO;
        BigInteger y = BigInteger.ONE;
        for(int i =2; i<= n; i++){

            answer = x.add(y);
            x = y;
            y = answer;
            
        }
        return answer.mod(new BigInteger("1234567")).intValue();
    }
    
    
}