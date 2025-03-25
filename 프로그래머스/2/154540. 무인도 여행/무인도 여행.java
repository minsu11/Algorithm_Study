import java.util.*;
class Solution {
    public int[] solution(String[] maps) {
        int[] answer = {};
        String[][] strArr = new String[maps.length][maps[0].length()];
        boolean[][] visitor = new boolean[maps.length][maps[0].length()];
        List<Integer> list = new ArrayList<>();        
        // string array init
        for(int i = 0; i < maps.length; i++){
            String[] str = maps[i].split(""); // string array
            for(int j = 0; j < str.length; j++){                
                strArr[i][j] = str[j];
            }
        }
        
        for(int i = 0; i < strArr.length; i++){
            int num = 0;
            for(int j = 0; j < strArr[i].length; j++){
                if(strArr[i][j].equals("X")){
                    visitor[i][j] = true;
                    continue;
                }
                if(visitor[i][j]){
                    continue;
                }
                // 여기서 bfs 숫자만
                int sum = bfs(visitor, i,j, strArr);  
                list.add(sum);
            }
            
        }
        if(list.size()==0){
            list.add(-1);
        }
        
        Collections.sort(list);
        
        return list.stream().mapToInt(i->i).toArray();
    }
    
    public int bfs(boolean[][] check, int x, int y, String[][] strArr){
        if(strArr[x][y].equals("X")){
            return 0;
        }
        if(check[x][y]){
            return 0;
        }

        int sum = Integer.parseInt(strArr[x][y]);

        check[x][y] = true;
        if( x < strArr.length-1){
            sum += bfs(check,x+1,y,strArr);
        }
        
        if(y < strArr[0].length-1){
            sum+=bfs(check,x,y+1, strArr);
        }
        
        if(x >0){
            sum+=bfs(check,x-1,y, strArr);
        }
        
        if(y >0 ){
            sum+=bfs(check,x,y-1, strArr);
        }
        
        
        return sum;
        
        
    }
    
}