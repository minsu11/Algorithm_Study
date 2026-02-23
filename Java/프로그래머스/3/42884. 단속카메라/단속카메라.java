import java.util.*;
class Solution {
    public int solution(int[][] routes) {
        int answer = 0;
        boolean[] check = new boolean[routes.length];
        // 정렬?
        Arrays.sort(routes, Comparator.comparingInt(a->a[1]));
        
        for(int i = 0; i < routes.length; i++){
            // 차량이 만나는지점
            if(check[i]){
                continue;
            } 
            int start =routes[i][1];
            check[i] = true;
            for(int j = i; j< routes.length; j++){
                if(check[j]){
                    continue;
                }
                if(start >= routes[j][0]){
                    check[j] = true;
                }
            }
            answer++;
        }
        
        return answer;
    }
}