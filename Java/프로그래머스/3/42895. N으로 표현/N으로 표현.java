import java.util.*;
class Solution {
    public int solution(int N, int number) {
        int answer = -1;
        Map<Integer, Set<Integer>> map = new HashMap<>();
        
        for(int i = 1; i <= 2 ; i++){
            Set<Integer> set = new HashSet<>();
            if(i == 1){
                if(N == number){
                    return 1;
                }
                set.add(N);
            }else {
                if(N+N == number || N-N == number || N/N == number || N*N == number|| N*10 +N == number){
                    return 2;
                }
                set.add(N+N);
                set.add(N-N);
                set.add(N/N);
                set.add(N*N);
                set.add(N*10 + N);
            }
            map.put(i, set);
            
        }
        
        for(int i = 3; i<= 8; i++){
            Set<Integer> curSet = new HashSet<>();
            for(int j = 1; j <= i/2; j++){
               Set<Integer> beforeSet = map.get(j);
               Set<Integer> prevSet = map.get(i - j);
             for(Integer num1: beforeSet){
                for(Integer num2:prevSet){
                    if(num1 + num2 == number ||
                      num1 - num2 == number ||
                        num2 - num1 == number ||
                       num1 * num2 == number ||
                       (num2 != 0 && num1 / num2 == number )||
                       (num1 != 0 && num2 / num1 == number) 
                      ){
                        return i;
                    }
                    curSet.add(num1 + num2);
                    if(num1 - num2 >= 0){
                        
                        curSet.add(num1 - num2);
                    }
                    if(num2 - num1 >= 0){
                        
                        curSet.add(num2 - num1);
                    }
                    curSet.add(num1 * num2);
                    if (num2 != 0) {
                        curSet.add(num1 / num2);
                    }

                    if (num1 != 0) {
                        curSet.add(num2 / num1);
                    }
                }
            }
            

            }
            
           
            int num = 0;
            for(int j = 0; j < i; j ++){
                num = (num * 10) + N;
            }
            if(num == number){
                return i;
            }
            curSet.add(num);
            map.put(i, curSet);
        }
        
        return -1;
    }
}