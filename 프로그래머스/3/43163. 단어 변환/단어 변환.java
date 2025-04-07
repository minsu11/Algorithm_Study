class Solution {
    // 한 번에 한 개의 알파벳 변환
    static int answer = Integer.MAX_VALUE;
    static boolean[] visit;
    public int solution(String begin, String target, String[] words) {
        
        boolean check = true;
        visit = new boolean[words.length];
        int correctCnt = 0; // 변환한 뒤 값이 target과 동일할 떄
        for(String word: words){
            if(word.equals(target)){
                check =false;
                break;
            }
        }
        
        if(check){
            return 0;
        }
        
        // 지금 생각나는 건 굉장히 느린건데...
        dfs(begin,target, words, 0);
        
        return answer;
    }
    
    public void dfs(String begin, String target, String[] word, int cnt){
        if(begin.equals(target)){
            answer = Math.min(cnt, answer);
            return;
        }
        
        for(int i=0; i < word.length; i++){
            if(visit[i]){
                continue;
            }
            
            if(checkMove(begin,word[i])){
                visit[i] = true;
                dfs(word[i], target,word, cnt+1);
                visit[i] = false;
            }
            
        }
        

    }
    
    public boolean checkMove(String begin, String target){
        int cnt = 0;
        
        char[] beginCharArray = begin.toCharArray();
        char[] targetCharArray = target.toCharArray();
        
        for(int i = 0; i < begin.length(); i++){
            if(beginCharArray[i] == targetCharArray[i]){
                cnt++;
            }
        }
        
        if(cnt+1 == targetCharArray.length){
            return true;
        }
        
        return false;
    }
}