class Solution {
    public int[] solution(String s) {

        int changeNum = 0;
        int deleteCnt = 0;
        
        while(s.length() > 1){
            int size = s.length();
            s = s.replaceAll("0","");
            int n = size - s.length();
            System.out.println("num: "+ n);
            changeNum += n;
            s = Integer.toBinaryString(s.length());
            deleteCnt+=1;
        }
        int[] answer = {deleteCnt, changeNum};
        
        return answer;
    }
}