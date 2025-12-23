import java.util.*;
class Solution {
    public int[] solution(int n) {
        if(isPrimeNumber(n)){
            return new int[]{n};
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 2; i  <n; i++){
            if(!isPrimeNumber(i)){
                continue;
            }
            if(n % i == 0){
                list.add(i);   
            }
            
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
    public  boolean isPrimeNumber(int n){
        for(int i = 2; i * i <= n; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}