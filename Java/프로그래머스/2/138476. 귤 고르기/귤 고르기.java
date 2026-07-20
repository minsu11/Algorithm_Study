import java.util.*;
class Solution {
    
//     public int solution(int k, int[] tangerine) {
//         int answer = 0;
//         Map<Integer, Integer> freq = new HashMap<>();
//         int size = tangerine.length;
//         int[] cntArr = new int[size+1];
        
//         for(int x : tangerine){
//             freq.put(x, freq.getOrDefault(x,0) +1);
//         }
        
//         for(int c : freq.values()){
//             cntArr[c]++;
//         }
       
//         for(int i = size; i >=0; i--){
//             if(cntArr[i] ==0){
//                 continue;
//             }
//             int type = cntArr[i];
//             int total = cntArr[i] * i;
            
//             if(total <= k){
//                 answer += type;
//                 k -= total;
//             }
//             else{
//                 answer += (k+i-1)/i;
//                 break;
//             }
//         }
//         return answer;
//     }
    public int solution(int k, int[] tangerine) {
        int answer = 1;
        // greedy
        Arrays.sort(tangerine);
        int num = tangerine[0];
        int cnt = 0;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < tangerine.length; i++){
            if( num == tangerine[i]){
                cnt++;
                
                if(i == tangerine.length-1){
                    list.add(cnt);
                }
            }else{
                list.add(cnt);
                cnt = 1;
                num = tangerine[i];
            }
            
        }
        
        int[] arr = new int[list.size()];
        for(int i =0 ; i < list.size(); i++){
            arr[i] = list.get(i);
        }
        Arrays.sort(arr);
        
        for(int i = arr.length-1; i>=0; i--){
            if(k <= arr[i]){
                break;
            }else{
                k -= arr[i];
                answer+=1;
            }
        }
        
        return answer;
    }
}