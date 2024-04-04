import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int comNum = Integer.parseInt(br.readLine()); // 컴 숫자
        int nodeNum = Integer.parseInt(br.readLine()); // 컴끼리 연결된 숫자
        Map<Integer, List<Integer>> result = new HashMap<>();
        Map<Integer, Boolean> check = new HashMap<>();
        int num = 0;

        for (int i = 1; i <= comNum; i++) {

            result.put(i, new ArrayList<Integer>());
            check.put(i, false);
        }

        for (int i = 0; i < nodeNum; i++) {

            String[] str = br.readLine().split(" ");
            int num1 = Integer.parseInt(str[0]);
            int num2 = Integer.parseInt(str[1]);

            result.get(num2).add(num1);
            result.get(num1).add(num2);

        }

        function(result, check, 1);
        for (int i = 2; i <= comNum; i++) {
            if (check.get(i)) {
                num += 1;
            }
        }
        System.out.println(num);
    }

    public static void function(Map<Integer, List<Integer>> result, Map<Integer, Boolean> check, int virus) {
        if (result.get(virus).size() == 0) {
            check.put(virus, true);
            return;
        }
        for (int i = 0; i < result.get(virus).size(); i++) {
            int num = result.get(virus).get(i);
            if (!check.get(num)) {
                check.put(num, true);
                function(result, check, num);
            }

        }

    }
}