import java.io.*;
import java.util.*;
public class Main {
    public static int count = 0;
    public static void main(String[] args) throws Exception {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()); // dna 수
            int m = Integer.parseInt(st.nextToken()); // 글자 수
            List<String> list = new ArrayList();
            String[] strArr = {
            "A", "C","G","T"
            };
            int[] strNum = new int[strArr.length];
            for(int i = 0; i < n; i++){
                String str = br.readLine();
                if(str.length()>m){
                    throw new IllegalArgumentException();
                }
                list.add(str);
            }

            int cnt = 0;
            char[][] charArr =new char[n][m];
            Collections.sort(list);
            StringBuilder sb =new StringBuilder();
            for(int i = 0; i < n; i++){
                charArr[i] = list.get(i).toCharArray();
            }
            
            for(int i =0; i < m; i++){
                for(int j = 0; j < n ; j++){
                    switch (charArr[j][i]) {
                        case 'A':
                            strNum[0]+=1;
                            break;
                        case 'C':
                            strNum[1]+=1;
                            break;
                        case 'G':
                            strNum[2]+=1;
                            break;
                        case 'T':
                            strNum[3]+=1;
                            break;
                        default:
                            break;
                    }
                }
                int count = strNum[0];
                int idx = 0;
                for(int j = 1; j < strNum.length; j++){
                    if(count < strNum[j]){
                        count = strNum[j];
                        idx = j;
                    }
                    
                }
                for(int j = 0; j < strNum.length; j++){
                    if(idx != j){
                        cnt += strNum[j];
                    }
                    strNum[j] = 0;
                }
                sb.append(strArr[idx]);



            }

            System.out.println(sb.toString());
            System.out.println(cnt);
        }catch(IOException e){

        }
    }
}
