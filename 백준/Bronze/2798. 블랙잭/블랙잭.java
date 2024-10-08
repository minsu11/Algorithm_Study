import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static Queue<String> que = new LinkedList<>();

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int[] arr = new int[n];

            st = new StringTokenizer(br.readLine());
            for(int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            int sum = 0;
            for(int i = 0; i < n-2; i++) {
                for(int j =i+1; j < n; j++) {
                    for(int k = j+1; k < n; k++) {
                         if(arr[i] + arr[j] + arr[k] <= m && sum < arr[i] + arr[j] + arr[k]) {
                            sum = arr[i] + arr[j] + arr[k];
                        }
                    }
                }
            }
            System.out.println(sum);

        } catch (IOException e) {

        }
    }
}
