class Solution {
    public String solution(String s) {
        String answer = "";
        String[] split=s.split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(String str : split){
            int num = Integer.parseInt(str);
            if(max < num){
                max = num;
            }
            if(min > num){
                min = num;
            }
        
        }
        return ""+min+" "+max;
    }
}