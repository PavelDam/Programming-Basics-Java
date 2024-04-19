package L03ConditionalStatementsAdvanced.Bonus;

import java.util.Scanner;

public class P10x2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double num = Double.parseDouble(scanner.nextLine());
        double sum = 0;
        while (num >= 0) {

            sum = num * 2;
            System.out.printf("Result: %.2f%n", sum);

            num = Double.parseDouble(scanner.nextLine());
        }
        if (num < 0) {
            System.out.println("Negative number!");
        }
    }
}
