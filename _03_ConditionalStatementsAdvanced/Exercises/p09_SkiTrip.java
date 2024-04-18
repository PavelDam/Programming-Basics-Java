package L03ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class P09SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String evaluation = scanner.nextLine();
        int nights = days - 1;
        double totalPrice = 0;
        switch (type) {
            case "room for one person":
                totalPrice = nights * 18;
                break;
            case "apartment":
                if (days < 10) {
                    totalPrice = (nights * 25) * 0.7;
                } else if (days > 10 && days < 15) {
                    totalPrice = (nights * 25) * 0.65;
                } else if (days > 15){
                    totalPrice =(nights * 25) * 0.5;
                }
                break;
            case "president apartment":
                if (days < 10) {
                    totalPrice = (nights * 35) * 0.90;
                } else if (days < 15) {
                    totalPrice = (nights * 35) * 0.85;
                } else if (days > 15){
                    totalPrice =(nights * 35) * 0.80;
                }
                break;
        }
        if (evaluation.equals("positive")) {
            totalPrice = totalPrice * 1.25;
        }else if (evaluation.equals("negative")) {
            totalPrice = totalPrice * 0.90;
        }
        System.out.printf("%.2f",totalPrice);
    }
}
