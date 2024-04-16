package L02ConditionalStatements.Bonus;

import java.util.Scanner;

public class P04TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Такси. Начална такса: 0.70 лв. Дневна тарифа: 0.79 лв. / км. Нощна тарифа: 0.90 лв. / км.
        //•	Автобус. Дневна / нощна тарифа: 0.09 лв. / км. Може да се използва за разстояния минимум 20 км.
        //•	Влак. Дневна / нощна тарифа: 0.06 лв. / км. Може да се използва за разстояния минимум 100 км.
        int nKilometers = Integer.parseInt(scanner.nextLine());
        String dayOrNight = scanner.nextLine();

        double totalPrice = 0;
        if (nKilometers < 20) {
            double tariff = 0;

            if (dayOrNight.equals("day")) {
                tariff = 0.79;
            } else if (dayOrNight.equals("night")) {
                tariff = 0.90;
            }

            totalPrice = 0.70 + tariff * nKilometers;

        } else if (nKilometers >= 100) {
            totalPrice = 0.06 * nKilometers;
        } else {
            totalPrice = 0.09 * nKilometers;
        }
        System.out.printf("%.2f",totalPrice);
    }
}
//Да се отпечата на конзолата най-ниската цена за посочения брой километри, форматирана до втория знак след десетичния разделител.