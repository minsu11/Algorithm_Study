class Solution {
    // diffs: 현재 퍼즐 난이도, times
    public int solution(int[] diffs, int[] times, long limit) {
        int answer = 0;
        int first = Integer.MAX_VALUE;
        int end = Integer.MIN_VALUE;
        for(int i = 0; i < diffs.length; i++){
            first = Math.min(first, diffs[i]);
            end = Math.max(end,diffs[i]);
        }
        int mid = (first + end) / 2 ;
        
        while(true){
            if(end == first){
                answer = first;
                break;
            }
            long sum = 0L;
            boolean check = true;
            for(int i = 0; i < diffs.length; i++){

                long num = times[i];
                if(mid < diffs[i] ){
                    
                    num = (times[i] + times[i-1]) * (diffs[i] - mid) + times[i];
                }
                sum += num;
                if(limit < sum){
                    check = false;
                    break;
                }
            }
            
            if(!check){
                first = mid+1;
            }else{
                end = mid;
            }
            mid = (first + end) / 2 ;

        }

        return answer;
    }
}