import java.util.*;
class Solution {
//     public int solution(int[] citations) {
//         int answer = 0;
//         for(int i = 0; i < citations.length; i++){
//             for(int j = i + 1; j < citations.length ; j++){
//                 if(citations[i] > citations[j]){
//                     int tmp = citations[i];
//                     citations[i]= citations[j];
//                     citations[j] = tmp;
//                 }
//             }
//         }
//         int i = 0;
//         while(answer < citations.length - i){
//             if(citations[i] <= answer){
//                 i++;
//             }else{
//             answer++;    
//             }
            
//         }
        
        
//         return answer;
//     }
    
    
    
    
    public int solution(int[] citations) {
        Arrays.sort(citations);
        // 논문의 갯수
        int answer =0;
        int count = citations.length;
        if(count <= citations[0]){
            return citations.length;
        }
        for(int i =0; i < count ; i++){
            if(citations[i] >= count - i){
                answer = count - i; 
                break;
            }
        }
        
        
        return answer;
    }
    
    
}