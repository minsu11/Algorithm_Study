import java.util.*;
class Solution {
    public String[] solution(String[] record) {
        int size = 0;
        Map<String, String> map = new HashMap<>();
        for(int i = 0; i < record.length; i++){
            String[] command = record[i].split(" ");
            if(command.length >2){
                map.put(command[1], command[2]);
            }
        }
        List<String> list = new ArrayList<>();
        for(int i = 0; i < record.length; i++){
            String[] s = record[i].split(" ");
            if(s[0].equals("Change")){
                continue;
            }
            String name = map.get(s[1]);
            if(s[0].equals("Enter")){
                list.add(name+"님이 들어왔습니다.");
            }else{
                list.add(name+"님이 나갔습니다.");
            }
            
            
        }
        
        String[] answer = new String[list.size()];
        
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer; 
    }
}