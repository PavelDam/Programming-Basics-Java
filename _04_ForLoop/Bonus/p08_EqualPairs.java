package L04ForLoop.Bonus;

import java.util.Scanner;

public class P08EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int sum1 = 0;
        for (int i = 1; i <= 2 * num; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            if (i <= 2) {
                sum += currentNum;
            } else if (i <= 4) {
                sum1 += currentNum;
            }


        }
    }
}
