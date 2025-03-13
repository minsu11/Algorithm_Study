import java.util.*;
class Solution {
    Map<String,Integer> surveyMap = new TreeMap<>();
    String[] str = {"R", "T", "C", "F",  "J","M", "A", "N"};
    public Solution(){
        for(int i = 0; i < str.length; i++){
            surveyMap.put(str[i], 0);
        }
        
    }
    public String solution(String[] survey, int[] choices) {
        // survey 원소 첫번째는 비동의, 두번재는 동의
        Map<Integer, Integer> num = new HashMap<>();
        StringBuilder answer = new StringBuilder();        
        int x = -4;
        for(int i =1; i<= 7; i++){
            
            num.put(i,x+i);
        }
        
        for(int i = 0; i < survey.length; i++){
            String[] s = survey[i].split("");
            int score = num.get(choices[i]);
            int s1 = surveyMap.get(s[0]) -score ;
            int s2 =  surveyMap.get(s[1]) +score;
            surveyMap.put(s[0], s1);
            surveyMap.put(s[1],s2);
        }
        
        for(int i = 0; i < str.length; i+=2){
            if(surveyMap.get(str[i]) < surveyMap.get(str[i+1])){
                answer.append(str[i+1]);
            }
            else {
                answer.append(str[i]);
            }
        }
                

        return answer.toString();
    }
}