package L04ForLoop.Lab;

import java.util.Scanner;

public class P03Num1ToNStep3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= num; i = i + 3) {
            System.out.println(i);
        }
    }
}
