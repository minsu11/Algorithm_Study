import java.util.*;
class Solution {
    public int[] solution(int[] fees, String[] records) {
        List<Integer> answer = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> feesMap = new TreeMap<>();
        int defaultTime = fees[0];
        int defaultFee = fees[1];
        int sliceTime = fees[2];
        int sliceTimeFee = fees[3];
        
        for(String str : records){
            // value[0] : time
            // value[1] : car number
            // value[2] : IN or OUT
            String[] value = str.split(" ");
            String timeValue = value[0];
            String carNumber = value[1];
            String method = value[2];
            
            if(method.equals("IN")){
                String[] times = timeValue.split(":");
                Integer time = (23*60 + 59) - ((Integer.parseInt(times[0]) * 60) +Integer.parseInt(times[1])) ;
                map.put(carNumber, time);
            }
            else if(method.equals("OUT")){
                String[] times = timeValue.split(":");
                Integer time = (23*60+59)-((Integer.parseInt(times[0]) * 60) +Integer.parseInt(times[1])) ;
                
                Integer inTime = map.get(carNumber);
                time = inTime -time;
                
                if(feesMap.containsKey(carNumber)){
                    Integer accumulatedTime = feesMap.get(carNumber); // 누적 시간
                    time += accumulatedTime;
                }                
                feesMap.put(carNumber, time);    
                map.remove(carNumber);
            }
        }
        // 여기서 map 저장된 데이터 까지 시간 계산
        
        for(String key: map.keySet()){
            Integer time = map.get(key);
            if(!feesMap.containsKey(key)){
                feesMap.put(key, time);
                continue;
            }
            
            Integer accumulatedTime = feesMap.get(key);
            feesMap.put(key, accumulatedTime + time);
        }
        
        System.out.println(feesMap.toString());
        
        // 시간 다구함 
        // 여기서부터 식 계산
        /*
            int defaultTime = fees[0];
        int defaultFee = fees[1];
        int sliceTime = fees[2];
        int sliceTimeFee = fees[3];        
        */
        for(String key : feesMap.keySet()){
            Integer time = feesMap.get(key); // time
            if(time <= defaultTime){
                answer.add(defaultFee);
                continue;
            }
            
            Integer remainingTime = time - defaultTime;
            
            Integer remainingFee = ((int) Math.ceil((double)remainingTime / sliceTime)) * sliceTimeFee;
            answer.add(defaultFee + remainingFee);
            
        }
        
        
        return answer.stream().mapToInt(i->i).toArray();
    }
}