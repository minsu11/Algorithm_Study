import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        char c = words[0].charAt(words[0].length()-1);
        Set<String> set = new HashSet<>();
        set.add(words[0]);
        int turn = 0;
        int people = 0;
        for(int i = 1; i < words.length; i++){
            String word = words[i];
            int last = word.length()-1;
            if(c == word.charAt(0) && set.add(word)){
                c = word.charAt(last);
            }else{
                turn = (i + n) / n;
                people = i  % n + 1 ;
                break;
            }
        }    
        
        return new int[]{people,turn};
    }
}