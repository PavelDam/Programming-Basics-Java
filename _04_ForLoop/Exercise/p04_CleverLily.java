package L04ForLoop.Exercises;

import java.util.Scanner;

public class P04CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double washerPrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        double savedMoney = 0;
        int giftSum = 0;
        int toysCount = 0;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                giftSum += 10;
                savedMoney += giftSum - 1;
            } else {
                toysCount = toysCount + 1;
            }
        }
        double toysSum = toysCount * toyPrice;
        double totalMoney = toysSum + savedMoney;

        if (totalMoney >= washerPrice) {
            System.out.printf("Yes! %.2f", totalMoney - washerPrice);
        } else {
            System.out.printf("No! %.2f", washerPrice - totalMoney);
        }
    }
}
