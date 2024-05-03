package L06NestedLoops.Lab;

import java.util.Scanner;

public class P06Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int FloorsCount = Integer.parseInt(scanner.nextLine());
        int roomsCount = Integer.parseInt(scanner.nextLine());


        for (int floors = FloorsCount; floors >= 1; floors--) {
            for (int rooms = 0; rooms < roomsCount; rooms++) {
                if (floors == FloorsCount) {
                    System.out.printf("L%d%d ", floors, rooms);
                } else if (floors % 2 == 0) {
                    System.out.printf("O%d%d ", floors, rooms);
                } else {
                    System.out.printf("A%d%d ", floors, rooms);
                }
            }
            System.out.println();
        }
    }
}
