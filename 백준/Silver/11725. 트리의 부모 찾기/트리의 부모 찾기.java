
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int node = Integer.parseInt(br.readLine());
        Map<Integer, Integer> resultMap = new HashMap<>();
        Map<Integer, List<Integer>> data = new HashMap<>();
        List<Boolean> check = new ArrayList<>();
        for (int i = 1; i <= node; i++) {
            data.put(i, new ArrayList<>());
            check.add(false);
        }
        for (int i = 0; i < node - 1; i++) {
            String[] input = br.readLine().split(" ");
            data.get(Integer.parseInt(input[0])).add(Integer.parseInt(input[1]));
            data.get(Integer.parseInt(input[1])).add(Integer.parseInt(input[0]));

        }
        check.set(0, true);
        bfsFunc(data, resultMap, check, 1);
        for (int i = 2; i <= node; i++) {
            System.out.println(resultMap.get(i));
        }

    }

    public static void bfsFunc(Map<Integer, List<Integer>> data,
            Map<Integer, Integer> resultMap, List<Boolean> check, int root) {

        for (int i = 0; i < data.get(root).size(); i++) {
            int num = data.get(root).get(i);

            if (!check.get(num - 1)) {
                resultMap.put(num, root);
                check.set(num - 1, true);
                bfsFunc(data, resultMap, check, num);
            }
        }
    }
}