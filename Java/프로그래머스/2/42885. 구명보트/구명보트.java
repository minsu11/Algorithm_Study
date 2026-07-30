import java.util.Arrays;
class Solution {
//     public int solution(int[] people, int limit) {
//         int answer = 0;
//         int n = people.length;
//         Arrays.sort(people);
//         int start = 0;
//         for(int i = n-1; i >=start; i--){
//             if(start < i &&  people[i] + people[start] <= limit){
//                 start+=1;
//             }
//             answer+=1;
//         }
        
//         return answer;
//     }
    
     public int solution(int[] people, int limit) {
        int answer = 0;
     
         Arrays.sort(people);
         int start= 0;
         int end = people.length-1;
         boolean[] visited = new boolean[end+1];
         for(int i = end; i >=0; i-- ){
             
             if(visited[i]){
                 continue;
             }
             
             if(people[start] + people[i] <=limit){
                visited[start] = true;
                 start++;
             }
              
            visited[i]= true;    
            answer++;   
             
         }
         
        return answer;
    }
    
        
    
}