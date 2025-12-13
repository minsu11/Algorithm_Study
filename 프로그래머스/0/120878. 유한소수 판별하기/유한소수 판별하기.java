class Solution {
    public int solution(int a, int b) {
        
        int num = b / gcd(a,b);
        
        while(num%2 == 0){
            num /=2;
        }
        
        while(num % 5 ==0){
            num /=5;
        }
        if(num > 1){
            return 2;
        }
        
        return 1;
    }
    // a 분자, b 분모
    public static int gcd(int a, int b){
        // if(b < a){
        //     int tmp = a;
        //     a = b;
        //     b = tmp;
        // }
        if(a == 0){
            return b;
        }
        
        return gcd(b%a, a);
    }
}