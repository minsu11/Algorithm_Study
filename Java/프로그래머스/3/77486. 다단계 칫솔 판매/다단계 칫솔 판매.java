import java.util.*;

class Solution {
    public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        int[] answer = new int[enroll.length];
        // key 본인, value 연결된 사람
        Map<String, String> map = new HashMap<>();
        Map<String, Integer> priceMap = new HashMap<>();
        for(int i =0; i < referral.length; i++){
            map.put(enroll[i], referral[i]);            
            priceMap.put(enroll[i], 0);
        }
        for(int i=0; i < seller.length; i++){
            int price =0;
            int num = amount[i] * 100;
            String child = seller[i];
            String parent ="";
            while(!child.equals("-")){
                parent = map.get(child);
                price = priceMap.get(child);
                int money = num / 10;
                
                if(money >0){
                    num -= money;
                    priceMap.put(child, price+num);
                    num = money;
                    
                }else{
                    priceMap.put(child, price + num);
                    break;
                }
                child = parent;
                
            }
            
            
        }
        for(int i =0 ; i < enroll.length; i++){
            answer[i] = priceMap.get(enroll[i]);
        }
        
        return answer;
    }
    
}