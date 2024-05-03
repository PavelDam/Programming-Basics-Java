package L06NestedLoops.Lab;

import java.util.Scanner;

public class P03Combinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        int count = 0;
        for (int num1 = 0; num1 <= num; num1++) {
            for (int num2 = 0; num2 <= num; num2++) {
                for (int num3 = 0; num3 <= num; num3++) {
                    if (num1 + num2 + num3 == num) {
                        count++;
                    }
                }
            }
        }
        System.out.printf("%d", count);
    }
}
