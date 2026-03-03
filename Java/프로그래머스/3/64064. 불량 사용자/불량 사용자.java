import java.util.*;
class Solution {
    Set<Integer> set = new HashSet<>();
    String[] user;
    String[] ban;
    int[] b;
    boolean[] visited;
    List<int[]> list = new ArrayList<>();
    public int solution(String[] user_id, String[] banned_id) {
        int answer = 0;
        this.user = user_id;
        this.ban = banned_id;
        this.b = new int[banned_id.length];
        visited = new boolean[user.length];
        dfs(0,0);
        
        for(int i =0; i < list.size();i++){
            int[] arr = list.get(i);
            int num = 0;
            for(int j = 0; j < arr.length; j++){
                num |= (1 << arr[j]);
            }
            set.add(num);
        }
        
        return set.size();
    }
    
    public void dfs(int sum,int idx){
        if(ban.length == idx){
            list.add(b.clone());
            return;
        }
        
        
            for(int j = 0; j < user.length; j++){
                if(!visited[j] && user[j].length() == ban[idx].length()){
                    boolean check = true;
                    for(int k = 0; k < user[j].length(); k++){
                        if(ban[idx].charAt(k) != '*' && user[j].charAt(k) != ban[idx].charAt(k)){
                            check = false;
                        }
                    }
                    if(check){
                        b[idx] = j;
                        visited[j] = true;
                        dfs(sum+j, idx+1);
                        visited[j] = false;

                    }
                }
                
            
        }
    }
    
   
}