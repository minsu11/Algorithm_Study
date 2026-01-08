class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        // 실패율이 높은 스테이지 부터 정렬해서 보여주면됨
        int totalUser = stages.length;
        int[] s = new int[N];
        double[] failCalArr = new double[N];
        for(int i = 0; i < stages.length; i++){
            if(stages[i] - 1 >= N){
                continue;
            }
            s[stages[i]-1] +=1;
        }
        
        // 실패율 계산
        for(int i = 0; i < N; i++){
            failCalArr[i] = s[i] == 0 ? 0 : (double) s[i] / totalUser;
            totalUser -= s[i];
        }
        
        for(int i = 0; i < N; i++ ){
            double max = -1.0;
            int idx =0;
            for(int j = 0; j < N; j++){
                if(max < failCalArr[j]){
                    max = failCalArr[j];
                    idx = j;
                }
            }
            
            answer[i] = idx+1;
            failCalArr[idx] = -1.0;
            
        }
        
        return answer;
    }
}