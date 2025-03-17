class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        if(n < m){
            answer[0] = gcd(m,n);    
        }else{
            answer[0] = gcd(n,m);
        }
        
        answer[1] = answer[0] * (n/answer[0]) *(m/answer[0]);
        
        return answer;
    }
    
    public int gcd(int x, int y){
        if(x % y == 0){
            return y;
        }
        
        return gcd(y, x%y);
    }
}