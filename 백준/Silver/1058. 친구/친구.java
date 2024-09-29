import java.io.*;
import java.util.*;
public class Main {
    public static int count = 0;
    public static void main(String[] args) throws Exception {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            int num = Integer.parseInt(br.readLine());
            char[][] charArr = new char[num][num];
            boolean[][] friendCheck = new boolean[num][num];

            int[] friendNum = new int[num];
            Queue<Integer>[] que = new Queue[num];
            for(int i = 0; i < num; i++){
                charArr[i] = br.readLine().toCharArray();
            }

            // 각 사람의 친구 수 구하기
            for(int i = 0; i< num; i++){
                que[i] = new LinkedList<>();
                for(int j = 0; j < num; j++){
                    if(charArr[i][j] == 'Y' && i != j){
                        que[i].add(j);
                        friendCheck[i][j] = true;
                    }   
                }
                friendNum[i]=que[i].size();
            }
            
            for(int k = 0; k < num; k++){
            int maxFriendNum = friendNum[k];
            int cnt = 0;


            // 친구의 친구 구하기
            while(!que[k].isEmpty()){
                int i = que[k].poll();
                cnt+=1;
                for(int j = 0; j<num; j++){
                    if(charArr[i][j] == 'Y' && j !=k && !friendCheck[k][j]){
                        que[k].add(j);
                        
                        friendCheck[k][j] = true;
                        friendNum[k] += 1;

                    }
                }
                if(maxFriendNum == cnt){
                    break;
                }

            }
        }
        int result = 0;
        for(int i =1; i < num; i++){

            if(friendNum[result] < friendNum[i]){
                result = i;
            }
        }
        System.out.println(friendNum[result]);
        }catch(IOException e){

        }   
    }

}
