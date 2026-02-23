import java.util.*;
class Solution {
    public int solution(int[][] routes) {
        int answer = 1;
        Arrays.sort(routes, Comparator.comparingInt(a->a[1]));
        int start = routes[0][1];
        for(int i = 1; i < routes.length; i++){
            // 차량이 만나는지점
            if(start < routes[i][0]){
                start =routes[i][1];
                answer++;
            }
        }
        
        return answer;
    }
}