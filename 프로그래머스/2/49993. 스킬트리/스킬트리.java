class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        char[] skills = skill.toCharArray();
        int size = skills.length;
        for(String s : skill_trees){
            char[] st = s.toCharArray();
            int index =0;
            boolean check = true;
            for(char c : st){
                if(index >= size){
                    break;
                }
                if(c == skills[index]){
                    index++;
                }else if(skill.contains(String.valueOf(c))){
                    check = false;
                }
            }
            
            if(check){
                answer++;
            }
        }
        return answer;
    }
}