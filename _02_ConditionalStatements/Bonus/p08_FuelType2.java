package L02ConditionalStatements.Bonus;

import java.util.Scanner;

public class P08FuelType2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //•	Бензин – 2.22 лева за един литър,
        //•	Дизел – 2.33 лева за един литър
        //•	Газ – 0.93 лева за литър
        //Карта за отстъпка:18 ст. за литър бензин, 12 ст. за литър дизел и 8 ст. за литър газ.
        //Ако шофьора е заредил между 20 и 25 литра включително, той получава 8 процента отстъпка от крайната цена,
        // при повече от 25 литра гориво, той получава 10 процента отстъпка от крайната цена.
        String fuelType = scanner.nextLine();
        double literFuel = Double.parseDouble(scanner.nextLine());
        String clubCard = scanner.nextLine();
        double totalFuelPrice = 0;

        if (fuelType.equals("Gas")) {

            if (clubCard.equals("Yes")) {
                totalFuelPrice = literFuel * 0.93 - literFuel * 0.08;

            } else if (clubCard.equals("No")) {
                totalFuelPrice = literFuel * 0.93;
            }
            if (literFuel >= 20 && literFuel <= 25) {
                totalFuelPrice = totalFuelPrice * 0.92;
            } else if (literFuel > 25) {
                totalFuelPrice = totalFuelPrice * 0.90;
            }
        }
        if (fuelType.equals("Gasoline")) {

            if (clubCard.equals("Yes")) {
                totalFuelPrice = literFuel * 2.22 - literFuel * 0.18;

            } else if (clubCard.equals("No")) {
                totalFuelPrice = literFuel * 2.22;
            }
            if (literFuel >= 20 && literFuel <= 25) {
                totalFuelPrice = totalFuelPrice * 0.92;
            } else if (literFuel > 25) {
                totalFuelPrice = totalFuelPrice * 0.90;
            }
        }
        if (fuelType.equals("Diesel")) {

            if (clubCard.equals("Yes")) {
                totalFuelPrice = literFuel * 2.33 - literFuel * 0.12;

            } else if (clubCard.equals("No")) {
                totalFuelPrice = literFuel * 2.33;
            }
            if (literFuel >= 20 && literFuel <= 25) {
                totalFuelPrice = totalFuelPrice * 0.92;
            } else if (literFuel > 25) {
                totalFuelPrice = totalFuelPrice * 0.90;
            }
        }
        System.out.printf("%.2f lv.",totalFuelPrice);
    }
}
//•	"{крайната цена на горивото} lv."