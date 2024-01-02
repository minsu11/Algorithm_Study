class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int idx = 0;
        for(boolean check : finished){
            if(!check){
                idx++;
            }
        }
        String[] answer = new String[idx];
        idx = 0;
        for(int i = 0; i < todo_list.length; i++){
            if(!finished[i]){
                answer[idx] = todo_list[i];
                idx++;
            }
            
        }
        
        return answer;
    }
}