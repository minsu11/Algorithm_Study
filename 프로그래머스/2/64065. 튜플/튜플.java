import java.util.*;
class Solution {
    public int[] solution(String s) {
        List<Integer> list = new ArrayList<>();
        String[] strArr = s.split("},");
        if(strArr.length == 1){
            String str = strArr[0].replace("{","").replace("}","");
            return new int[]{Integer.parseInt(str)};
        }
        
        for(int i = 0; i < strArr.length;i++){
            strArr[i] = strArr[i].replace("{","").replace("}","");
        }
        Arrays.sort(strArr, Comparator.comparingInt(String::length));
        
        StringBuilder sb = new StringBuilder();
        list.add(Integer.parseInt(strArr[0]));
        for(int i = 1; i < strArr.length; i++){
            String[] st = strArr[i].split(",");
            for(int j = 0; j < st.length; j++){
                int num = Integer.parseInt(st[j]);
                boolean check = true;
                for(int k =0; k < list.size();k++){
                    if(list.get(k) == num){
                        check = false;
                        break;
                    }
                }
                if(check){
                    
                list.add(num);
                }
                
            }
        }
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++){
            answer[i]=list.get(i);
        }
        
        return answer;
    }
}