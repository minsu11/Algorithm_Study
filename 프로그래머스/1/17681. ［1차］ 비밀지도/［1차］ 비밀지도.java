class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        // n : 지도의 크기
        // arr1, arr2: 배열
        String[] answer = new String[n];
        
        String[][] arr1Str = new String[n][n];
        String[][] arr2Str = new String[n][n];
        
        int num = (int)Math.pow(2,n-1);
        
        for(int i = 0; i < arr1.length; i++){
            int n1 = arr1[i];
            int idx = -1;
            for(int j = num; j > 0; j/=2){
                idx++;
                if(j > n1){
                    arr1Str[i][idx] = "0";
                    continue;
                }
                n1 %=j;
                arr1Str[i][idx] = "1";
            }
            idx = -1;
            int n2 = arr2[i];
            for(int j = num; j > 0; j/=2){
                idx++;
                if(j > n2){
                    arr2Str[i][idx] = "0";
                    continue;
                }
                n2 %=j;
                arr2Str[i][idx] = "1";
            }
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < n; j++){
                if(arr1Str[i][j].equals("1") || arr2Str[i][j].equals("1")){
                    sb.append("#");
                }
                else{
                    sb.append(" ");
                }
            }
            answer[i] = sb.toString();
        }
        
        
        
        
        return answer;
    }
}