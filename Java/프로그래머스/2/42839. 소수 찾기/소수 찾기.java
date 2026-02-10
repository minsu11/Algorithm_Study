import java.util.*;
class Solution {
    Set<Integer> set = new HashSet<>();
    boolean[] visited;
    StringBuilder sb = new StringBuilder();
    public int solution(String numbers) {
        int answer = 0;
        
        visited = new boolean[numbers.length()];
        for(int i = 1; i <=numbers.length(); i++){
            
            dfs(numbers,i);
        }
        
        System.out.println(set.toString());
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            if(isPrime(it.next())){
                answer++;
            }
        }
        return answer;
    }
    
    public boolean isPrime(int num){
        if(num < 2){
            return false;
        }else if (num == 2){
            return true;
        }else if(num % 2 == 0){
            return false;
        }
        
        for(int i = 3; i*i <= num; i+=2){
            if(num % i==0){
                return false;
            }
            
        }
        return true;
    }
    
    
    
    public void dfs(String numbers, int cnt){
        if(sb.toString().length() == cnt){
            set.add(Integer.parseInt(sb.toString()));
            return;
        }
        
        for(int i = 0; i < numbers.length(); i++){
            if(!visited[i]){
                int len = sb.length();
                visited[i] = true;
                sb.append(String.valueOf(numbers.charAt(i)));
                dfs(numbers,cnt);
                visited[i] = false;
                sb.setLength(len);
            }
        }
    }
}