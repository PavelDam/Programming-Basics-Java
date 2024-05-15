package Exam20and21April2019;

import java.util.Scanner;

public class P03EasterTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();
        String dates = scanner.nextLine();
        int nightCount = Integer.parseInt(scanner.nextLine());
        int pricePerNight = 0;

        switch (destination) {
            case "France":
                switch (dates) {
                    case "21-23":
                        pricePerNight = 30;
                        break;
                    case "24-27":
                        pricePerNight = 35;
                        break;
                    case "28-31":
                        pricePerNight = 40;
                        break;
                }
                break;
            case "Italy":
                switch (dates) {
                    case "21-23":
                        pricePerNight = 28;
                        break;
                    case "24-27":
                        pricePerNight = 32;
                        break;
                    case "28-31":
                        pricePerNight = 39;
                        break;
                }
                break;
            case "Germany":
                switch (dates) {
                    case "21-23":
                        pricePerNight = 32;
                        break;
                    case "24-27":
                        pricePerNight = 37;
                        break;
                    case "28-31":
                        pricePerNight = 43;
                        break;
                }
                break;
        }

        double totalPrice = nightCount * pricePerNight;
        System.out.printf("Easter trip to %s : %.2f leva.", destination, totalPrice);
    }
}
