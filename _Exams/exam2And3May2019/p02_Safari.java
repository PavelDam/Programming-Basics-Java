package Exam2And3May2019;

import java.util.Scanner;

public class P02Safari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Цената на един литър гориво е 2.10 лв.
        //•	Цената за екскурзовод е 100лв.
        //•	В зависимост от деня има отстъпки от общата цена - за събота 10%, а за неделя 20%
        double budget = Double.parseDouble(scanner.nextLine());
        double neededLitersFuel = Double.parseDouble(scanner.nextLine());
        String day = scanner.nextLine();// Saturday , Sunday

        double fuelPrice = neededLitersFuel * 2.10;
        double totalEksAndFuel = fuelPrice + 100;

        if (day.equals("Saturday")) {
            totalEksAndFuel = totalEksAndFuel * 0.9;
        } else if (day.equals("Sunday")) {
            totalEksAndFuel = totalEksAndFuel * 0.8;
        }
        if (budget >= totalEksAndFuel) {
            System.out.printf("Safari time! Money left: %.2f lv.", budget - totalEksAndFuel);
        } else {
            System.out.printf("Not enough money! Money needed: %.2f lv.", totalEksAndFuel - budget);
        }
    }
}
