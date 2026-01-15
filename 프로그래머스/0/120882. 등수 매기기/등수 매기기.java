class Solution {
    public int[] solution(int[][] score) {
        int len = score.length;
        int[] answer = new int[len];
        double[] ava = new double[len];
        
        // 평균 구함
        for(int i = 0; i < len; i++){
            ava[i] = (double) (score[i][0] + score[i][1]) /2;
        }
        
        // 등수 매기기
        double beforeScore =0;
        int cnt =1;
        int n =0;
        for(int i =0; i< len; i++){
            double max = -1;
            int idx = -1;
            for(int j =0; j < len; j++){
                if(max < ava[j]){
                    max = ava[j];
                    idx = j;
                }
            }
            
            if(beforeScore == max){
                answer[idx] = n;
                cnt++;
            }else {
                answer[idx] = n+cnt;
                beforeScore = max;
                n +=cnt;
                cnt = 1;
                
            }
            ava[idx]=-1;
            
        }
        
        return answer;
    }
}