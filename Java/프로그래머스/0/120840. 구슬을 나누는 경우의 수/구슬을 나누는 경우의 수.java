class Solution {
    public int solution(int balls, int share) {
        if(balls == share){
            return 1;
        }
        
        int answer = 1;
        int nM = balls - share; 
        int max = Math.max(nM, share);
        int min = Math.min(nM, share);
        
        long x = 1;
        long y = 1;
        
        for(int i = 1; i <= min; i++){
            long a = max+i;
            long b = i;
            if( a % b == 0){
                a /=b;
                b = 1;
            }

            x *=a;
            y *=b;
    
        }
        
        answer = (int)(x/y);
        return  answer;
    }
}