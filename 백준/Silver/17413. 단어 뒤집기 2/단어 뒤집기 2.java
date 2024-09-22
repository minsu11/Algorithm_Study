import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        StringBuilder sb =new StringBuilder();
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            String[] lines = br.readLine().trim().split("");
            boolean check = false;
            String str = new String();
            for(int i = 0; i < lines.length; i++){
                String l = lines[i];
                if(l.equals(">")){
                    check = false;
                    sb.append(l);
                }else if(l.equals("<") || check){
                    if(str.length()>0){
                        sb.append(str);
                        str = new String();
                    }
                    check= true;
                    sb.append(l);
                }else if(l.equals(" ")){
                    sb.append(str). append(" ");
                    str = new String();
                }
                else{
                    str = l + str;
                }
            }
            if(str.length()> 0){
                sb.append(str);
            }
            System.out.println(sb.toString());
        }catch(IOException e){

        }


    }

    


    
}
