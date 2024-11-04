import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            int n = Integer.parseInt(br.readLine()); // int num
            StringTokenizer st = new StringTokenizer(br.readLine());
            List<Integer> numList = new ArrayList<>();
            while(st.hasMoreTokens()){
                numList.add(Integer.parseInt(st.nextToken()));
            }

            int m = Integer.parseInt(br.readLine());
            int result = 0;

            for(int i = 0; i < numList.size(); i++){
                if(numList.get(i) == m){
                    result+=1;
                }
            }
            System.out.println(result);


        }catch (IOException e){

        }

    }
}
