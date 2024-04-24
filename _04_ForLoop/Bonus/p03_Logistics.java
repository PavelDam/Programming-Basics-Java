package L04ForLoop.Bonus;

import java.util.Scanner;

public class P03Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Проверка за тегло
        //•	До 3 тона – микробус (200 лева на тон)
        //•	От 4 до 11 тона – камион (175 лева на тон)
        //•	12 и повече тона – влак (120 лева на тон)

        int cargoCount = Integer.parseInt(scanner.nextLine());

        int priceWithBus = 0;
        int priceWithTruck = 0;
        int priceWithTrain = 0;
        int totalWeight = 0;

        int tonsWithBus = 0;
        int tonsWithTruck = 0;
        int tonsWithTrain = 0;

        for (int i = 1; i <= cargoCount; i++) {
            int cargoWeight = Integer.parseInt(scanner.nextLine());
            totalWeight += cargoWeight;

            if (cargoWeight <= 3) {
                tonsWithBus += cargoWeight;
                priceWithBus += cargoWeight * 200;
            } else if (cargoWeight <= 11) {
                tonsWithTruck += cargoWeight;
                priceWithTruck += cargoWeight * 175;
            } else {
                tonsWithTrain += cargoWeight;
                priceWithTrain += cargoWeight * 120;
            }

        }
        double averagePerTon = (1.0 * priceWithBus + priceWithTruck + priceWithTrain) / (1.0 * totalWeight);
        double pWithBus = 1.0 * tonsWithBus / totalWeight * 100;
        double pWithTruck = 1.0 * tonsWithTruck / totalWeight * 100;
        double pWithTrain = 1.0 * tonsWithTrain / totalWeight * 100;
        System.out.printf("%.2f%n", averagePerTon);
        System.out.printf("%.2f%%%n", pWithBus);
        System.out.printf("%.2f%%%n", pWithTruck);
        System.out.printf("%.2f%%%n", pWithTrain);
    }
}
