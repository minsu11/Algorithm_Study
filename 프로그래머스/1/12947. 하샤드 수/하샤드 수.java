class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        int sum = 0;
        int num = x;
        
        while(num != 0){
            try{
            sum += num % 10;
            System.out.println(sum);
            num /= 10;    
            }catch(ArithmeticException e){
                System.out.println("error");
                
            }
            
        }
        
        
        
        return x % sum == 0;
    }
}