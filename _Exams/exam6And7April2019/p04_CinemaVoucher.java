package Exam6And7April2019;

import java.util.Scanner;

public class P04CinemaVoucher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int voucher = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int ticketPrice = 0;
        int productPrice = 0;
        int totalPrice = 0;
        int ticketCount = 0;
        int productCount = 0;


        while (!input.equals("End")) {

            int lenghtText = input.length();
            char ch0 = input.charAt(0);
            char ch1 = input.charAt(1);

            int ascii = (int) ch0;
            int ascii1 = (int) ch1;

            if (lenghtText > 8) {
                ticketPrice = ch0 + ch1;
                totalPrice += ticketPrice;
                if (totalPrice > voucher) {
                    break;
                }
                ticketCount++;
            } else {
                productPrice = ch0;
                totalPrice += productPrice;
                if (totalPrice > voucher) {
                    break;
                }
                productCount++;
            }

            input = scanner.nextLine();
        }
        System.out.println(ticketCount);
        System.out.println(productCount);

    }
}
