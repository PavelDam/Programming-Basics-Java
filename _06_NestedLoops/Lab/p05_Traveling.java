package L06NestedLoops.Lab;

import java.util.Scanner;

public class P05Traveling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();



        while (!input.equals("End")) {
            String destination = input;
            double budget = Double.parseDouble(scanner.nextLine());

            double money = 0;
            while (money < budget) {
                double savedMoney = Double.parseDouble(scanner.nextLine());;
                money += savedMoney;
                if (money >= budget) {
                    System.out.printf("Going to %s!%n", destination);
                    break;
                }
            }
            input = scanner.nextLine();
        }
    }
}
