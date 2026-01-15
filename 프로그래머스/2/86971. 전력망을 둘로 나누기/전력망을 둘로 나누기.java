import java.util.*;
class Solution {
    public int solution(int n, int[][] wires) {
        int answer = 101;
        int len = wires.length;
        List<Integer>[] list = new ArrayList[n+1];
        
        for(int i = 0; i < list.length; i++){
            list[i] = new ArrayList<>();
        }
        
        for(int[] w : wires){
            list[w[0]].add(w[1]);
            list[w[1]].add(w[0]);
        }
        
        
        // 완전탐색
        for(int i = 0; i < len; i++){
            int a = wires[i][0];
            int b = wires[i][1];
            int cnt = 1;
            boolean[] visited = new boolean[n+1];
            Queue<Integer> q = new ArrayDeque();
            q.add(a);
            visited[a] = true;
            while(!q.isEmpty()){
                int cur = q.poll();
                for(int next : list[cur]){
                    if((a == cur && b == next) ||(a == next && b == cur)){
                        continue;
                    }
                    
                    if(visited[next]){
                        continue;
                    }
                    visited[next] =true;
                    cnt++;
                    q.add(next);
                }
            }
            
            int num = Math.abs((n-2*cnt));
            if(answer > num){
                answer = num;
            }
            
        }
        
        return answer;
    }
    
    
    
   
}