package L05WhileLoop.Lab;

import java.util.Scanner;

public class P03SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        while (true) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            sum = sum + currentNum;
            if (sum >= num) {
                break;
            }
        }
        System.out.println(sum);
    }
}
