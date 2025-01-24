class Solution {
    public long solution(long n) {
        String r = "";
        String[] strArr = (""+n).split("");
        swap(strArr);
        for(int i = 0; i < strArr.length; i++){
            r += strArr[i];
        }
        
        return Long.parseLong(r);
    }
    
    public void swap(String[] strArr){
         for(int i = 0; i < strArr.length; i++){
            for(int j = i+1; j< strArr.length; j++){
                if(Long.parseLong(strArr[i])< Long.parseLong(strArr[j])){
                    String tmp = strArr[i];
                    strArr[i] = strArr[j];
                    strArr[j]=tmp;
                }
            }
        }
    }
}