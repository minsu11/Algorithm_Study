import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int round = scanner.nextInt();
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        boolean check = false;
        int cnt = 1;
        if (num2 < num1) {
            int tmp = num2;
            num2 = num1;
            num1 = tmp;
        }
        for (;;) {
            if (num1 % 2 != 0 && num2 == (num1 + 1)) {
                check = true;
                break;
            }
            num1 = condition(num1);

            num2 = condition(num2);
            cnt++;

        }
        System.out.println(cnt);

    }

    public static int condition(int num) {
        return num % 2 != 0 ? (num / 2) + (num % 2) : num / 2;
    }
}
