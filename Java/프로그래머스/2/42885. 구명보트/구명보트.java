import java.util.Arrays;
class Solution {
    int max = 0;
    // 9  89 90
    public int solution(int[] people, int limit) {
        int answer = 0;
        int n = people.length;
        boolean[] visited = new boolean[n];
        Arrays.sort(people);
        int start = 0;
        for(int i = n-1; i >=0; i--){
            if(visited[i]){
                continue;
            }
            int weight = people[i] + people[start];
            if(weight <= limit){
                visited[start] = true;
                start+=1;
            }
            visited[i] = true;
            answer+=1;
        }
        
        return answer;
    }
    
        
    
}