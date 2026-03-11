import java.util.*;

class Solution {
    public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        int n = enroll.length;
        int[] answer = new int[n];
        // key 본인, value 연결된 사람
        Map<String, Integer> map = new HashMap<>();
        for(int i =0; i < n; i++){
            map.put(enroll[i], i);
        }
        int[] parent = new int[n];
        for(int i =0; i < n; i++){
            parent[i] = referral[i].equals("-") ? -1 : map.get(referral[i]);
        }
        
        for(int i=0; i < seller.length; i++){
            int total = amount[i] * 100;
            
            int child = map.get(seller[i]);
            while(child>=0){
                int parentIdx = parent[child];
                
                int money = total / 10;
                
                if(money >0){
                    total -= money;
                    answer[child] +=total;
                    total = money;
                    
                }else{
                    answer[child] +=total;
                    break;
                }
                child = parentIdx;
                
            }

        }
        
        return answer;
    }
    
}