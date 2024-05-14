package Exam18and19July2020;

import java.util.Scanner;

public class P01AgencyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int adultTickets = Integer.parseInt(scanner.nextLine());
        int childrenTickets = Integer.parseInt(scanner.nextLine());
        double priceAdultTicket = Double.parseDouble(scanner.nextLine());
        double serviceTaxPrice = Double.parseDouble(scanner.nextLine());

        double priceChildrenTicket = priceAdultTicket * 0.30;
        double adultTaxTicketPrice = priceAdultTicket + serviceTaxPrice;
        double childrenTaxTicketPrice = priceChildrenTicket + serviceTaxPrice;

        double totalPrice = (adultTaxTicketPrice * adultTickets) + (childrenTaxTicketPrice * childrenTickets);
        double income = totalPrice * 0.20;

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", name, income);
    }
}
