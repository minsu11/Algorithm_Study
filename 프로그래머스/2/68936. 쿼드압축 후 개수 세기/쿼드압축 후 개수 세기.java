class Solution {
    public int[] solution(int[][] arr) {
        // 절반 나눠서 해야하나
        // 어차피 2부터 하고
        int[] answer = new int[2];
        int oneSize = 0;
        int zeroSize = 0;
         
        int size = arr.length; // size 시작점
        for(int[] intArr: arr){
            for(int num : intArr){
                if(num == 0){
                    zeroSize++;
                }
                else if(num == 1){
                    oneSize++;
                }
            }
        }
        
        
        int idx = 1;
        while((idx*=2) <= arr.length){
            for(int i = 0; i < arr.length; i+=idx){
                for(int j = 0; j < arr.length; j+=idx){
                    int cnt = 0;
                    for(int k = 0; k < idx; k++){
                        for(int a = 0; a < idx; a++){
                            
                            if(arr[i+k][j+a] == 1){
                                cnt++;
                            }else{
                                
                                cnt--;
                            }
                        }
                    }
                    
                    if(cnt == idx*idx){ // 1 일때

                        oneSize -=3;
                    }else if(cnt == -(idx*idx)){
                        zeroSize -=3;
                    }
                    
                    
                }
            }
        }
        answer[0] = zeroSize;
        answer[1] = oneSize;
        return answer;
    }
}