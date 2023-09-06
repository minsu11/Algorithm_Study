import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num < 3 && num > 1000) {
            return;
        }
        int[][] student = new int[num][5];
        int[] value = new int[num];
        boolean[][] check = new boolean[num][num];

        int idx = 0;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < 5; j++) {
                student[i][j] = scanner.nextInt();

            }
            value[i] = 0;
        }
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                check[i][j] = false;
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < num; j++) {
                for (int k = 0; k < num; k++) {
                    if (student[j][i] == student[k][i] && j != k) {
                        check[j][k] = true;
                    }
                }
            }
        }
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (check[i][j] == true) {
                    value[i]++;
                }
            }
        }
        int tmp = value[0];
        int result = 0;
        for (int i = 1; i < num; i++) {
            if (tmp < value[i]) {
                tmp = value[i];
                result = i;
            }
        }
        System.out.println(result + 1);

    }
}
