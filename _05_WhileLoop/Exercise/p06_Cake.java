package L05WhileLoop.Exercise;

import java.util.Scanner;

public class P06Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lenght = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());

        int totalPieces = lenght * width;
        String input = scanner.nextLine();

        while (!input.equals("STOP")) {
            int pieces = Integer.parseInt(input);
            totalPieces -= pieces;
            if (totalPieces <= 0) {
                break;
            }
            input = scanner.nextLine();
        }
        if (totalPieces >= 0) {
            System.out.printf("%d pieces are left.", totalPieces);
        } else {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(totalPieces));
        }
    }
}
