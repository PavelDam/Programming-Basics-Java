package Exam15And16June2019;

import java.util.Scanner;

public class P01MovieProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movieName = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        int tickets = Integer.parseInt(scanner.nextLine());
        double ticketPrice = Double.parseDouble(scanner.nextLine());
        int percentage = Integer.parseInt(scanner.nextLine());

        double totalPrice = days * ticketPrice * tickets;
        double studioProfit = totalPrice * (1.0 * percentage / 100);
        double studio = totalPrice - studioProfit;
        System.out.printf("The profit from the movie %s is %.2f lv.", movieName, studio);
    }
}
