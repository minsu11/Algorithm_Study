import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.util.*;
class Main{
    StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] cmd = br.readLine().split(" ");
        int n = Integer.parseInt(cmd[0]);
        int m = Integer.parseInt(cmd[1]);
        boolean[] visited = new boolean[n+1];
        Main algo = new Main();
        algo.dfs(bw,n,m,0,visited);


    }

    public void dfs(BufferedWriter bw, int n, int m, int cnt, boolean[] visited) throws IOException{
        if(cnt == m){
            bw.write(sb.toString().trim());
            bw.newLine();
            bw.flush();
            return;
        }

        for(int i = 1; i <= n; i++){
            if(visited[i]){
                continue;
            }
            int len = sb.length();
            sb.append(i).append(" ");
            visited[i] = true;
            dfs(bw,n,m,cnt+1, visited);
            sb.setLength(len);
            visited[i] = false;
        }
    }
}