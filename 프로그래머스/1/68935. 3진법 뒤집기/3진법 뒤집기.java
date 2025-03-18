class Solution {
    public int solution(int n) {

        
        StringBuffer sb = new StringBuffer(Integer.toString(n,3));
        String str = sb.reverse().toString();
        
        return Integer.parseInt(str,3);
    }
}