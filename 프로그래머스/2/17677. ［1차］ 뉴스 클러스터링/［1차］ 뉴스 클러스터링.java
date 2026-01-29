import java.util.*;
class Solution { 
    public int solution(String str1, String str2) {
        int answer = 0;
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        String s1 = str1.toUpperCase();
        String s2 = str2.toUpperCase();
        Set<String> set =new HashSet<>();

        for(int i = 0; i < s1.length()-1; i++){
            char a = s1.charAt(i);
            char b = s1.charAt(i+1);
            if(a >= 'A' && a <='Z' && b >='A' && b <='Z' ){
                String token = s1.substring(i,i+2);
            map1.put(token,map1.getOrDefault(token, 0)+1);
            }
        }
        
       for(int i = 0; i < s2.length()-1; i++){
            char a = s2.charAt(i);
            char b = s2.charAt(i+1);
            if(a >= 'A' && a <='Z' && b >='A' && b <='Z' ){
                String token = s2.substring(i,i+2);
            map2.put(token,map2.getOrDefault(token, 0)+1);
            }
        }
        
        int inter = 0;
        int union = 0;
        set.addAll(map1.keySet());
        set.addAll(map2.keySet());
        
        
        for(String key : set){
            int a = map1.getOrDefault(key, 0);
            int b = map2.getOrDefault(key, 0);
            
            inter += Math.min(a,b);
            union += Math.max(a,b);
        }
    
        
        if(union == 0){
            return 65536;
        }
        
        answer = inter * 65536 / union;
        return answer;
    }
}