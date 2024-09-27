import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            int num = Integer.parseInt(br.readLine());
            int n = 0;
            int m = 0;
            int[] numArr = new int[num];
            for(int i = 0; i < num; i++){
                String[] strArr = br.readLine().split(" ");
                n = Integer.parseInt(strArr[0]);
                m = Integer.parseInt(strArr[1]);
                
                for(int j = 0; j < m; j ++){
                    String str = br.readLine();
                }
                numArr[i] = n-1;
            }

            for(int i = 0; i < numArr.length; i++){
                System.out.println(numArr[i]);
            }

        }catch(IOException e){

        }
    }


    

    
}
