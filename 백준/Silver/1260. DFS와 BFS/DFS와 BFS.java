
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int node = Integer.parseInt(str[0]);
        int edge = Integer.parseInt(str[1]);
        int root = Integer.parseInt(str[2]);
        StringBuilder dfsResult = new StringBuilder();
        StringBuilder bfsResult = new StringBuilder();
        Map<Integer, List<Integer>> graph = new HashMap();
        Map<Integer, Boolean> dfsCheck = new HashMap();
        Map<Integer, Boolean> bfsCheck = new HashMap();

        for (int i = 1; i <= node; i++) {
            graph.put(i, new ArrayList());
            dfsCheck.put(i, false);
            bfsCheck.put(i, false);
        }
        for (int i = 0; i < edge; i++) {
            String[] data = br.readLine().split(" ");
            graph.get(Integer.parseInt(data[0])).add(Integer.parseInt(data[1]));
            graph.get(Integer.parseInt(data[1])).add(Integer.parseInt(data[0]));
        }
        for (int i = 1; i <= node; i++) {
            Collections.sort(graph.get(i));
        }

        dfsResult.append(root);
        bfsResult.append(root);
        dfsCheck.put(root, true);
        bfsCheck.put(root, true);
        dfsFunc(graph, dfsCheck, root, dfsResult);
        bfsFunc(graph, bfsCheck, node, root, bfsResult);
        System.out.println(dfsResult.toString());
        System.out.println(bfsResult.toString());
    }

    public static void dfsFunc(Map<Integer, List<Integer>> graph, Map<Integer, Boolean> check, int root,
            StringBuilder dfsResult) {
        if (graph.get(root).size() == 0) {
            return;
        }

        for (int i = 0; i < graph.get(root).size(); i++) {
            int num = graph.get(root).get(i);
            if (!check.get(num)) {
                check.put(num, true);
                dfsResult.append(" " + num);
                dfsFunc(graph, check, num, dfsResult);
            }

        }
    }

    public static void bfsFunc(Map<Integer, List<Integer>> graph, Map<Integer, Boolean> check, int node, int root,
            StringBuilder bfsResult) {
        if (graph.get(root).size() == 0) {
            return;
        }
        List<Integer> list = new ArrayList<>();
        list.add(root);
        for (int i = 0; i < node; i++) {
            if (i == list.size()) {
                break;
            }
            for (int j = 0; j < graph.get(list.get(i)).size(); j++) {
                int num = graph.get(list.get(i)).get(j);
                if (!check.get(num)) {
             
                    list.add(num);
                    check.put(num, true);
                    bfsResult.append(" " + num);
                }
            }

        }

    }
}