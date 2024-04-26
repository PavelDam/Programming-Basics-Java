package L05WhileLoop.Exercise;

import java.util.Scanner;

public class P07Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int lenght = Integer.parseInt(scanner.nextLine());
        int high = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        int vRoom = width * lenght * high;
        int totalBoxes = 0;

        while (!input.equals("Done")) {
            int boxCount = Integer.parseInt(input);
            totalBoxes += boxCount;

            if (vRoom < totalBoxes) {
                break;
            }
            input = scanner.nextLine();
        }
        if (vRoom >= totalBoxes) {
            System.out.printf("%d Cubic meters left.", vRoom - totalBoxes);
        } else {
            System.out.printf("No more free space! You need %d Cubic meters more.", totalBoxes - vRoom);
        }
    }
}
