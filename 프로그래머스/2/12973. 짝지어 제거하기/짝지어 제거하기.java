class Solution
{
    public int solution(String s)
    {
        int answer = -1;
        char[] cArr = new char[s.length()];
        int top = -1;
        for(char c : s.toCharArray()){
            if(top >= 0 && cArr[top] == c) {
                top--;
            }else {
                top++;
                cArr[top] = c;
            }
        }
        if(top == -1){
            return 1;
        }      
        return 0;
    }
}