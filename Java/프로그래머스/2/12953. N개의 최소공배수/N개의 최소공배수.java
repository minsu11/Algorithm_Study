import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int len = arr.length;
        int answer =arr[len-1];
        long l = arr[0];
        for(int i = 1; i < len; i++){
            l= lcm(l, arr[i]);
        }
        return (int) l;
    }
    public long lcm(long a, long b){
        return a / gcd(a,b) * b ;
    }
    public long gcd(long a, long b){
        while(b!=0){
            long t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
    
}