package L03ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class P01Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0;

        if (type.equals("Premiere")) {
            totalPrice = rows * columns * 12;
        } else if (type.equals("Normal")) {
            totalPrice = rows * columns * 7.50;
        } else if (type.equals("Discount")) {
            totalPrice = rows * columns * 5;
        }
        System.out.printf("%.2f", totalPrice);
    }
}
