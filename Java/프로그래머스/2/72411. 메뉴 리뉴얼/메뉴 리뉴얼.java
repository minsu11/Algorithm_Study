import java.util.*;
class Solution {
    Map<String, Integer> map;
    String[] orders;
    StringBuilder sb = new StringBuilder();
    boolean[] visiteds;
    public String[] solution(String[] orders, int[] course) {
        List<String> list = new ArrayList<>();
        
        this.orders = new String[orders.length];
        for(int i = 0; i < course.length; i++){
            map = new HashMap<>();

            for(int j = 0; j < orders.length; j++){
                char[] cArr = orders[j].toCharArray();
                Arrays.sort(cArr);
                this.orders[j] = new String(cArr);
                
                dfs(j, course[i], 0, -1);
            }
            int max = 0;
            for(String key: map.keySet()){
                int value = map.get(key);
                if(value <=1){
                    continue;
                }
                if(max < value){
                    max = value;
                }
            }
            for(String key: map.keySet()){
                int value = map.get(key);
               
                if(max == value){
                    list.add(key);
                }
            }
        }
        String[] answer = new String[list.size()];

        for(int i = 0 ; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        
        return answer;
    }
    
    public void dfs(int idx, int course, int cnt, int i){
        if(cnt == course){
            map.put(sb.toString(), map.getOrDefault(sb.toString(), 0)+1);
            return;
        }
        for(int j = i+1; j < orders[idx].length(); j++){
            int len = sb.length();
            String s =String.valueOf(this.orders[idx].charAt(j));
            sb.append(s);
            dfs(idx, course, cnt+1, j);
            sb.setLength(len);
        
        }

        
    }
}