class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int x = arr1.length;
        int y = arr2[0].length;
        int[][] answer = new int[x][y];
        
        for(int i =0; i < x*y; i++){
            int num = 0;
            int row = i /y;
            int col = i % y;
            for(int j = 0 ; j < arr2.length; j++){
                num += arr1[row][j] * arr2[j][col];
            }
            
            answer[row][col] = num;
        }
        
        
        return answer;
    }
}