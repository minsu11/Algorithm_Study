class Solution {
    public int solution(int[] array) {
                int cnt[] = new int[1001];
        int answer=0, max_cnt=-1, max_num=0;
        boolean check = false;
        for(int i =0; i <array.length; i++){
            for(int j = 0; j<cnt.length; j++){
                if(array[i] == j){
                    cnt[j]++;
                }
            }
        }
        // 위까지는 문제 없음

        for(int i = 0; i<cnt.length; i++){
                if(max_cnt <= cnt[i]){
                    if(max_cnt == cnt[i]){
                        check = false;
                    }
                    else{
                        max_num = i;
                        max_cnt = cnt[i];
                        check = true;
                    }

            }
        }

        if(check ==false){
            answer = -1;
        }
        else{
            answer = max_num;
        }
        return answer;
    }
}