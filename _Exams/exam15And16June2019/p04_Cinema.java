package Exam15And16June2019;

import java.util.Scanner;

public class P04Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hallCapacity = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        int ticketPrice = 5;
        int occupiedSeats = 0;
        int income = 0;

        while (!input.equals("Movie time!")) {
            int people = Integer.parseInt(input);
            if ((hallCapacity - occupiedSeats) < people) {
                System.out.println("The cinema is full.");
                System.out.printf("Cinema income - %d lv.", income);
                break;
            }
            income += ticketPrice * people;
            occupiedSeats += people;
            if (people % 3 == 0) {
                income = income - 5;
            }

            input = scanner.nextLine();
        }
        if (input.equals("Movie time!")) {
            System.out.printf("There are %d seats left in the cinema.%n", (hallCapacity - occupiedSeats));
            System.out.printf("Cinema income - %d lv.", income);
        }
    }
}
