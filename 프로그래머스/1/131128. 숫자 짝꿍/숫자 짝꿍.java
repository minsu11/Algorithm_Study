import java.lang.Math;
import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        List<Integer> list = new ArrayList<>();
        int[] xArr = new int[10];
        int[] yArr = new int[10];
        for(char c : X.toCharArray()){
            int i = c - '0';
            xArr[i]++;
        }
        
        for(char c : Y.toCharArray()){
            int i = c - '0';
            yArr[i]++;
        }
        
        for(int i = 0; i < 10; i++){
            if(xArr[i] ==0 || yArr[i] ==0){
                continue;
            }
            int common = Math.min(xArr[i], yArr[i]);
            for(int j = 0; j < common; j++){
                list.add(i);
            }
        }
        if(list.size() ==0){
            return "-1";
        }
        list.sort(Comparator.reverseOrder());
        
        for(int i =0; i < list.size(); i++){
            int num = list.get(i);
            if(i == 0 && num == 0){
                return "0";
            }
            answer.append(num);
        }
        
        return answer.toString();
    }
}