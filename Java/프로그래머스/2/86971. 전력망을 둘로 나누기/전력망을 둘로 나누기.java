import java.util.*;
class Solution {
    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;
        Map<Integer, List<Integer>> map = new HashMap<>();
        
        for(int i = 0; i < wires.length; i++){
            List<Integer> list;
            if(!map.containsKey(wires[i][0])){
                list = new ArrayList<>();
            }else {
                list = map.get(wires[i][0]);
            }
            list.add(wires[i][1]);
            map.put(wires[i][0], list);
            
            if(!map.containsKey(wires[i][1])){
                list = new ArrayList<>();
            }else {
                list = map.get(wires[i][1]);
            }
            list.add(wires[i][0]);
            map.put(wires[i][1], list);
            
        }
        
        for(int i = 1; i <=n;i++){
            // 현재 값과 연결된 값을 끊음

            List<Integer> list = map.get(i);
            for(Integer num: list){

                Deque<Integer> q = new ArrayDeque<>();
                boolean[] visited = new boolean[n+1];
                q.add(num);
                int sum = 1;
                visited[num] = true;
                visited[i]= true;
                while(!q.isEmpty()){
                    int value = q.poll();
                    List<Integer> l = map.get(value);
                    for(Integer num1 : l){
                        if(visited[num1]){
                            continue;
                        }
                        q.add(num1);
                        visited[num1] = true;
                        sum+=1;
                    }
                }
                if(Math.abs(Math.abs(n-sum) - sum)< answer){
                    answer = Math.abs(Math.abs(n-sum) - sum);
                }
                
                
            }
            
        }
        
        
        return answer;
    }
    
   
}