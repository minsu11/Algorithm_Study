import java.util.*;
class Solution {
    static int[] parent;
    public int solution(int n, int[][] costs) {
        int answer = 0;
        parent = new int[n];
        
        for(int i =0 ; i <n; i++){
            parent[i] = i;
        }
        
        Arrays.sort(costs,Comparator.comparingInt(a -> a[2]));
        int cnt = 0;
        for(int[] cost : costs){
            int x = cost[0];
            int y = cost[1];
            int value = cost[2];
            if(find(x) != find(y)){
                union(x,y);
                answer +=value;
                cnt+=1;
                if(cnt == n-1){
                    break;
                }
            }
        }
        
        return answer;
    }
    
    public int find(int n){
        if(parent[n] == n){
            return n;
        }
        parent[n] = find(parent[n]);
        return parent[n];
    }
    
    public void union(int a, int b){
        int pa = find(a);
        int pb = find(b);
        
        if(pa != pb){
            parent[pb] = pa;
        }
        
        
    }
    
    
}