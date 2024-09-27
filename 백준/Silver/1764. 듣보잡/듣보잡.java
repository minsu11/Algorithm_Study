import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int n =Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            Set<String> nSet = new HashSet<>();
            Set<String> mSet = new HashSet<>();
            Map<String, String> map = new HashMap<>();

            for(int i =0; i < n; i++){
                String str = br.readLine();
                nSet.add(str);
                map.put(str, str);

            }

            for(int i = 0; i < m; i++){
                String str = br.readLine();
                mSet.add(str);
                map.put(str, str);

            }
            List<String> list = new ArrayList<>();

            map.forEach((key,value)->{
                if(nSet.contains(value) && mSet.contains(value)){
                    list.add(value);
                }
            });

            Collections.sort(list);
            System.out.println(list.size());
            for(String str : list){
                System.out.println(str);
            }

            
        }catch(IOException e){
            
        }
    }
}
