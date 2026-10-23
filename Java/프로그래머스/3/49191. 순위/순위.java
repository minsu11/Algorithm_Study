import java.util.*;
class Solution {
    public int solution(int n, int[][] results) {
        int answer = 0;
        // 이긴 사람이랑 진 사람을 따로 분리
        Map<Integer, Set<Integer>> winnerMap = new HashMap<>();
        
        Map<Integer, Set<Integer>> loserMap = new HashMap<>();
        
        for(int i = 1; i <= n; i++){
            Set<Integer> set1 = new HashSet<>();
            Set<Integer> set2 = new HashSet<>();
            winnerMap.put(i, set1);
            loserMap.put(i, set2);
        }
        
        int[] arrCnt = new int[n+1];
        for(int i = 0; i < results.length; i++){
            int winner = results[i][0];
            int loser = results[i][1];
            
            winnerMap.computeIfAbsent(winner, (k) -> new HashSet<>()).add(loser);
            loserMap.computeIfAbsent(loser,(k) -> new HashSet<>()).add(winner);
        }
        for(int i = 1; i <= n; i++){
            // 결국에는 A B가 있으면 B가 졌잖아? 그러면 사실 그냥 A가 진 사람한테도 지는 거니깐 
            // 이긴 사람
            Set<Integer> winnerSet = winnerMap.get(i);
            // 진 사람
            Set<Integer> loserSet = loserMap.get(i);
            
            // 그러면 i가 이긴 사람의 loser map에 i가 진 사람을 넣어.
            for(Integer winner: winnerSet){
                for(Integer loser : loserSet){
                    Set<Integer> s = loserMap.get(winner);
                    s.add(loser);
                    loserMap.put(winner, s);
                    
                    Set<Integer> s1 = winnerMap.get(loser);
                    s1.add(winner);
                    winnerMap.put(loser,s1);
                }
            }
            
        }
        
        for(int i = 1; i <=n;i++){
            int winner =  winnerMap.get(i).size();
            int loser = loserMap.get(i).size();
            
            if(winner+loser == n-1){
                answer+=1;
            }
        }
     
        
        
        return answer;
    }

}