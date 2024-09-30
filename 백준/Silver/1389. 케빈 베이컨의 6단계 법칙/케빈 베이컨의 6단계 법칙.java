import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());

//
            int[][] f = new int[num1][num1];
            int[] result = new int[num1];
            int c = 0;
            while(c<num2){
                c++;
                String str = br.readLine();
                if(str.isEmpty()){
                    break;
                }

                int x = Integer.parseInt(str.split(" ")[0])-1;
                int y = Integer.parseInt(str.split(" ")[1])-1;

                f[x][y] = 1;
                f[y][x] = 1;

            }


            for(int i = 0; i < num1; i++){
                Queue<Integer> q = new LinkedList<>();
                q.add(i);
                boolean[] visitor = new boolean[num1];
                visitor[i] = true;
                int depth = 1;
                int a = 1;
                int b =0;
                while(!q.isEmpty()){
                    int root =q.poll();

                    for(int j =0; j < num1; j++){

                        if(f[root][j] == 1 && root != j && !visitor[j]) {
                            q.add(j);
                            result[i] += depth;
                            visitor[j] = true;
                        }
                    }
                    a-=1;
                    if(a == 0){
                        a = q.size();
                        depth+=1;
                    }


                }

            }
            int idx = 0;
            for(int i =1; i < result.length; i++){
                if(result[idx] > result[i]){
                    idx = i;
                }
            }

            System.out.println(idx+1);


        }catch(IOException e){

        }

    }
}
