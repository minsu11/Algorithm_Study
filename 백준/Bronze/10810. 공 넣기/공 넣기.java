import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int[] basket = new int[n];
            int[][] x = new int[m][3];


            for(int i = 0; i < m; i++){
                String[] str = br.readLine().split(" ");
                for(int j = Integer.parseInt(str[0])-1; j <= Integer.parseInt(str[1])-1; j++){
                    basket[j]= Integer.parseInt(str[2]);

                }
            }

            for(int i = 0; i < basket.length; i++){
                if(i < basket.length-1){

                    System.out.print(basket[i]+" ");
                }else {
                    System.out.print(basket[i]);
                }
            }



        }catch (IOException e){

        }

    }
}
