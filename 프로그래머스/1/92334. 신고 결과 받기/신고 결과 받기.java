import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        
        int[] answer = new int[id_list.length];
        Map<String, Integer> reportMap = new HashMap<>(); // 신고 당한 횟수
        
        Map<String, Set<String>> r = new HashMap<>(); // Key: 신고 당한 사람, value: 신고한 사람
        
        Map<String, Integer> cntMap = new HashMap<>();
        
        for(String id : id_list){
            reportMap.put(id, 0);
            Set<String> s = new HashSet<>();
            r.put(id, s);
            cntMap.put(id,0);
        }
        
        for(int i = 0; i < report.length; i++){
            String[] s = report[i].split(" ");
            
            Set<String> reportSet = r.get(s[1]); // 신고 당한 사람 
            if(!reportSet.contains(s[0])){
                reportSet.add(s[0]);
                r.put(s[1], reportSet);
                reportMap.put(s[1] , reportMap.get(s[1])+1); // 신고 횟수 증가    
            }
            
            
        }
        
        for(int i = 0; i < id_list.length; i++){
            int num = reportMap.get(id_list[i]);
            if(num <k){
                continue;
            }
            Set<String> reportSet = r.get(id_list[i]);
            for(String st: reportSet){
                cntMap.put(st, cntMap.get(st) + 1);
            }
        }
        
        for(int i = 0; i < id_list.length; i++){
            answer[i] = cntMap.get(id_list[i]);
        }
        
        
        return answer;
    }
}