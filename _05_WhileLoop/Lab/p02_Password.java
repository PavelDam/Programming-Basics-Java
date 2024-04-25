package L05WhileLoop.Lab;

import java.util.Scanner;

public class P02Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();
        String regPass = scanner.nextLine();


        while (true) {
            String pass = scanner.nextLine();
            if (pass.equals(regPass)) {
                break;
            }
        }
        System.out.printf("Welcome %s!", userName);
    }
}
