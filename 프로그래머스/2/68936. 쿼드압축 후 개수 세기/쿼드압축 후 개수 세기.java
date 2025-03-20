class Solution {
    private int[] answer ={0,0};
    public int[] solution(int[][] arr){
        dfs(arr, 0, 0, arr.length);
        return answer;
    }
    
    public void dfs(int[][] arr, int x, int y, int size){
        if(zip(arr, x, y, size, arr[x][y])){
            if(arr[x][y] == 1){
                answer[1]++;
            }else{
                answer[0]++;
            }
            return;
        }
        
        dfs(arr, x, y, size/2);
        dfs(arr, x+size/2, y, size/2);
        dfs(arr, x, y+size/2, size/2);
        dfs(arr, x+size/2, y+size/2, size/2);
        
        
    }
    
    public boolean zip(int[][] arr, int x, int y,int size, int start){
        for(int i = x; i < size+x; i++){
            for(int j = y; j < size+y; j++){
                if(start != arr[i][j]){
                    return false;
                }
            }
        }
        return true;
        
    }
    
    // for문 방식
//     public int[] solution(int[][] arr) {
//         // 절반 나눠서 해야하나
//         // 어차피 2부터 하고
//         int[] answer = new int[2];
//         int oneSize = 0;
//         int zeroSize = 0;
         
//         int size = arr.length; // size 시작점
//         for(int[] intArr: arr){
//             for(int num : intArr){
//                 if(num == 0){
//                     zeroSize++;
//                 }
//                 else if(num == 1){
//                     oneSize++;
//                 }
//             }
//         }
        
        
//         int idx = 1;
//         while((idx*=2) <= arr.length){
//             for(int i = 0; i < arr.length; i+=idx){
//                 for(int j = 0; j < arr.length; j+=idx){
//                     int cnt = 0;
//                     for(int k = 0; k < idx; k++){
//                         for(int a = 0; a < idx; a++){
                            
//                             if(arr[i+k][j+a] == 1){
//                                 cnt++;
//                             }else{
                                
//                                 cnt--;
//                             }
//                         }
//                     }
                    
//                     if(cnt == idx*idx){ // 1 일때

//                         oneSize -=3;
//                     }else if(cnt == -(idx*idx)){
//                         zeroSize -=3;
//                     }
                    
                    
//                 }
//             }
//         }
//         answer[0] = zeroSize;
//         answer[1] = oneSize;
//         return answer;
//     }
}