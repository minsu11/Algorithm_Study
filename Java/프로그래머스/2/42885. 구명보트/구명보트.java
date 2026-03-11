import java.util.Arrays;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int n = people.length;
        Arrays.sort(people);
        int start = 0;
        for(int i = n-1; i >=start; i--){
            if(start < i &&  people[i] + people[start] <= limit){
                start+=1;
            }
            answer+=1;
        }
        
        return answer;
    }
    
        
    
}