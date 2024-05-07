package L06NestedLoops.Exercises;

import java.util.Scanner;

public class P06CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int standartCount = 0;
        int kidCount = 0;
        int studentCount = 0;
        int soldTicketsCount = 0;


        while (!input.equals("Finish")) {
            String name = input;
            int seats = Integer.parseInt(scanner.nextLine());

            int occupiedSeats = 0;
            while (true) {
                String type = scanner.nextLine();
                if (type.equals("End") || type.equals("Finish")) {
                    break;
                }
                switch (type) {
                    case "standard":
                        standartCount++;
                        break;
                    case "student":
                        studentCount++;
                        break;
                    case "kid":
                        kidCount++;
                        break;
                }
                soldTicketsCount++;
                occupiedSeats++;
                if (occupiedSeats == seats){
                    break;
                }
            }
            System.out.printf("%s - %.2f%% full.%n", name, (1.0 * occupiedSeats / seats * 100));
            input = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d%n", soldTicketsCount);
        System.out.printf("%.2f%% student tickets.%n", (1.0 * studentCount / soldTicketsCount * 100));
        System.out.printf("%.2f%% standard tickets.%n", (1.0 * standartCount / soldTicketsCount * 100));
        System.out.printf("%.2f%% kids tickets.", (1.0 * kidCount / soldTicketsCount * 100));
    }
}
