class Solution {
    public String solution(String my_string, int[] index_list) {
        StringBuilder answer = new StringBuilder();
        char[] c = my_string.toCharArray();
        for(int idx : index_list){
            answer.append(Character.toString(c[idx]));
        }
        return answer.toString();
    }
}