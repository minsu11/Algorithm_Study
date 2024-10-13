import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static String[][] black = {
            {"B","W","B","W","B","W","B","W"},
            {"W","B","W","B","W","B","W","B"},
            {"B","W","B","W","B","W","B","W"},
            {"W","B","W","B","W","B","W","B"},
            {"B","W","B","W","B","W","B","W"},
            {"W","B","W","B","W","B","W","B"},
            {"B","W","B","W","B","W","B","W"},
            {"W","B","W","B","W","B","W","B"}
    };

    static String[][] white = {
            {"W","B","W","B","W","B","W","B"},
            {"B","W","B","W","B","W","B","W"},
            {"W","B","W","B","W","B","W","B"},
            {"B","W","B","W","B","W","B","W"},
            {"W","B","W","B","W","B","W","B"},
            {"B","W","B","W","B","W","B","W"},
            {"W","B","W","B","W","B","W","B"},
            {"B","W","B","W","B","W","B","W"}
    };



    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int blackCount = 0;
            int whiteCount = 0;
            int result =0;

            String[][]str = new String[n][m];

            for(int i=0; i < n; i++){
                str[i] = br.readLine().split("");
            }
            for(int i = 0; i <= n-8;i++){ // 전체 행
                for(int l = 0 ; l<=m-8;l++) {
                    for (int j = 0; j < 8; j++) {
                        for (int k = 0; k < 8; k++) { // 열의 갯수
                            if(str[i+j][k+l].equals(black[j][k])){
                                blackCount+=1;
                            }
                            if(str[i+j][k+l].equals(white[j][k])){
                                whiteCount+=1;
                            }
                        }

                    }
                    int a = Math.max(blackCount, whiteCount);
                    if(result == 0 || result < a){
                        result = a;
                    }
                    blackCount = 0;
                    whiteCount = 0;
                }
            }

            System.out.println(64-result);


        }catch (Exception e) {

        }
    }
}