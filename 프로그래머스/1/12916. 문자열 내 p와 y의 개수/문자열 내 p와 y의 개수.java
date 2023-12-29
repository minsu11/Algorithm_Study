class Solution {
    boolean solution(String s) {
        int num = 0;
        for(char c : s.toLowerCase().toCharArray()){
            if(c == 'p'){
                num +=1;
            }else if (c == 'y'){
                num -=1;
            }
        }

        return num == 0 ? true : false;
    }
}