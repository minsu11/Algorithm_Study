import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int len = want.length;
        Map<String,Integer> map = new HashMap<>();

        for(int i = 0; i < len; i++){
            map.put(want[i], i);
        }
        for(int i = 0; i <= discount.length-10; i++){
            int[] arr = new int[len];
            for(int j = i; j < i+10;j++){
                if(!map.containsKey(discount[j])){
                    break;
                }
                int idx = map.get(discount[j]);
                arr[idx]++;
            }
            boolean check = true;
            for(int j = 0; j < len; j++){
                if(arr[j] != number[j]){
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