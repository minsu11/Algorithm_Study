import java.util.*;
class Solution {
    public int[] solution(String[] genres, int[] plays) {
        Map<String, List<int[]> >map = new HashMap<>();
        Map<String, Integer> idxMap = new HashMap<>();
        Map<Integer, String> idxMap2 = new HashMap<>();

        List<int[]> list = new ArrayList<>();
        int idx = 0;
        for(int i = 0; i < genres.length; i++){
            String genre = genres[i];
            int play = plays[i];
            
            if(!idxMap.containsKey(genre)){
                idxMap.put(genre, idx);
                idxMap2.put(idx,genre);
                list.add(new int[]{idx, 0});    
                idx+=1;
            }
            map.computeIfAbsent(genre, (k) -> new ArrayList<>()).add(new int[]{i, play});
            int curIdx =idxMap.get(genre);
            int[] value = list.get(curIdx);
            value[1] = value[1] + play;
            list.set(curIdx, value);
        }
        
        list.sort((a,b) -> b[1] - a[1]);
        List<Integer> l = new ArrayList<>();
        for(int[] value: list){
            int curIdx = value[0];
            
            String genre = idxMap2.get(curIdx);
            List<int[]> curList = map.get(genre);
            curList.sort((a,b) -> b[1]- a[1]);
            for(int i = 0; i < 2; i++){
                if(curList.size() == i){
                    break;
                }
                int[] v = curList.get(i);
                l.add(v[0]);
            }
        }
        int[] answer = new int[l.size()];

        for(int i = 0; i < l.size(); i++){
            answer[i] = l.get(i);
        }
        return answer;
    }
}