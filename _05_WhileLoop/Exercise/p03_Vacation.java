package L05WhileLoop.Exercise;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double neededMoney = Double.parseDouble(scanner.nextLine());
        double money = Double.parseDouble(scanner.nextLine());

        int daysCount = 0;
        int spendingDaysCounter = 0;

        while (money < neededMoney && spendingDaysCounter < 5) {
            String action = scanner.nextLine();
            double sum = Double.parseDouble(scanner.nextLine());
            daysCount++;

            if (action.equals("spend")) {
                spendingDaysCounter++;
                money -= sum;
                if (money < 0) {
                    money = 0;
                }
            } else if (action.equals("save")) {
                money += sum;
                spendingDaysCounter = 0;
            }
        }
        if (spendingDaysCounter == 5) {
            System.out.println("You can't save the money.");
            System.out.printf("%d", daysCount);
        }
        if (money >= neededMoney) {
            System.out.printf("You saved the money for %d days.", daysCount);
        }
    }
}
