import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int answer = -1;
        int num = n / 5;
        
        for (int i = num; i >= 0; i--) {
            int x = 5 * i;

            if ((n - x) % 3 == 0) {
                answer = i +((n-x) / 3);
                break;
            } 
        }

        bw.write(String.valueOf(answer));
        bw.newLine();
        bw.flush();

    }
}

