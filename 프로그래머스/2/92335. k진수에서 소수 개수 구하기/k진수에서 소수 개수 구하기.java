import java.util.*;
class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        String s = "";
        
        while(n!= 0){
            s = ""+ (n%k) + s;
            n = n/k;
        } // 해당 진수로 변환
        System.out.println(s);
        String[] strArr = s.split("0");
        for(String str : strArr){
            if(str.equals("")){
                continue;
            }
            long num = Long.parseLong(str);
            boolean check = true;    
            if(num == 1){
                continue;
            }
            for(int i = 1; i<= Math.sqrt(num); i++){
                if(i != 1 && num % i == 0){
                    check = false;
                    break;
                }
            }
            
            if(check){
                answer++;
            }
        }
        
        return answer;
    }
}