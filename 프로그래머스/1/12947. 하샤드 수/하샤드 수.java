class Solution {
    public boolean solution(int x) {        
        int sum = 0;
        int num = x;
        
        do{
            sum += num % 10;
        }while((num /= 10) != 0);
        
        return x % sum == 0;
    }
}