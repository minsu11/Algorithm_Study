import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            int num = Integer.parseInt(br.readLine());
            String str = br.readLine();
            String[] strArr = str.split("R");
            String[] str2 = str.split("B");
            int bluecnt = 1;
            int redCnt = 1;
            for(int i = 0; i< strArr.length; i++){
                if(!"".equals(strArr[i])){
                    redCnt+=1;
                }
            }
            for(int i = 0; i < str2.length; i++){
                if(!"".equals(str2[i])){
                    bluecnt+=1;
                }

            }
            int num1 = redCnt >= bluecnt ? bluecnt:redCnt;
            
            System.out.println(num1);


        }catch(IOException e){
            
        }
    }
}
