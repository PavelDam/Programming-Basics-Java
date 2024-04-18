package L03ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class P07HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double studioPrice = 0;
        double apartmentPrice = 0;
        double totalStudioPrice = 0;
        double totalApartmentPrice = 0;
        //•	За студио, при повече от 7 нощувки през май и октомври : 5% намаление.
        //•	За студио, при повече от 14 нощувки през май и октомври : 30% намаление.
        //•	За студио, при повече от 14 нощувки през юни и септември: 20% намаление.
        //•	За апартамент, при повече от 14 нощувки, без значение от месеца : 10% намаление.

        switch (month) {

            case "May":
            case "October":

                studioPrice = 50;
                apartmentPrice = 65;
                totalStudioPrice = nights * studioPrice;
                totalApartmentPrice = nights * apartmentPrice;

                if (nights > 7 && nights < 14) {
                    totalStudioPrice = (nights * studioPrice) * 0.95;
                } else if (nights > 14) {
                    totalStudioPrice = (nights * studioPrice) * 0.70;
                }
                break;
            case "June":
            case "September":
                studioPrice = 75.20;
                apartmentPrice = 68.70;
                totalStudioPrice = nights * studioPrice;
                totalApartmentPrice = nights * apartmentPrice;

                if (nights > 14) {
                    totalStudioPrice = (nights * studioPrice) * 0.80;
                }
                break;
            case "July":
            case "August":
                studioPrice = 76;
                apartmentPrice = 77;
                totalStudioPrice = nights * studioPrice;
                totalApartmentPrice = nights * apartmentPrice;
                break;
        }
        if (nights > 14) {
            totalApartmentPrice = (nights * apartmentPrice) * 0.90;
        }
        System.out.printf("Apartment: %.2f lv.%n", totalApartmentPrice);
        System.out.printf("Studio: %.2f lv.", totalStudioPrice);
    }
}
