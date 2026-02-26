class Solution {
    int cnt = 0;
    String[] str = {"A", "C", "F", "J", "M", "N", "R", "T"};
    boolean[] visited = new boolean[8];
    StringBuilder sb = new StringBuilder();
    
    public int solution(int n, String[] data) {
        dfs(data);
        System.out.println(cnt);
        return cnt;
    }
    public void dfs(String[] data){
        if(sb.length() == 8){
            String st = sb.toString();
           for(int i = 0; i < data.length; i++){
               char s1 = data[i].charAt(0);
               char s2 = data[i].charAt(2);
               char op = data[i].charAt(3);
               int num = data[i].charAt(4) - '0';
               int pos1 = 0;
               int pos2 = 0;
               for(int j =0; j < 8; j++){
                   if(s1 == st.charAt(j)){
                       pos1 = j;
                   }
                   if(s2 == st.charAt(j)){
                       pos2 = j;
                   }
               }
               int distance = Math.abs(pos1- pos2)-1;
               if(op == '=' && distance != num) return;
                if(op == '>' && distance <= num) return;
                if(op == '<' && distance >= num) return;
              
           }
            cnt++;
           return;
        }
        for(int i = 0; i < 8; i++){
            if(!visited[i]){
                int len = sb.length();
                visited[i] = true;
                sb.append(str[i]);
                dfs(data);
                sb.setLength(len);
                visited[i] = false;
                
            }
            
        }
    }
    
}