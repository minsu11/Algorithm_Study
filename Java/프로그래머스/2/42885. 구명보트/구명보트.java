import java.util.Arrays;
class Solution {
    int max = 0;
    // 9  89 90
    public int solution(int[] people, int limit) {
        int answer = 0;
        int n = people.length;
        Arrays.sort(people);
        int start = 0;
        for(int i = n-1; i >=start; i--){
            int weight = people[i] + people[start];
            if(weight <= limit){
                start+=1;
            }
            answer+=1;
        }
        
        return answer;
    }
    
        
    
}