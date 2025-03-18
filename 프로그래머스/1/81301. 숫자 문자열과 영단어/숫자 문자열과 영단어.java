import java.util.*;

class Solution {
    String[] numberCase = {
        "zero",	"one", "two","three","four","five","six","seven","eight","nine"
    };
    public int solution(String s) {
        for(int i = 0; i < 10; i++){
            s = s.replaceAll(numberCase[i] , ""+i);

        }
        System.out.println(s);
        
        return Integer.parseInt(s);
    }
}