package Exam20and21April2019;

import java.util.Scanner;

public class P04EasterShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int eggsInShop = Integer.parseInt(scanner.nextLine());

        int eggsRemain = eggsInShop;
        String command = scanner.nextLine();

        boolean isValid = true;
        int soldEggs = 0;

        while (!command.equals("Close")) {
            int eggs = Integer.parseInt(scanner.nextLine());
            if (eggs > eggsRemain&& command.equals("Buy")) {
                isValid = false;
                break;
            }
            switch (command) {
                case "Buy":
                    eggsRemain -= eggs;
                    soldEggs += eggs;
                    break;
                case "Fill":
                    eggsRemain += eggs;
                    break;
            }

            command = scanner.nextLine();
        }
        if (isValid) {
            System.out.println("Store is closed!");
            System.out.printf("%d eggs sold.", soldEggs);
        } else {
            System.out.println("Not enough eggs in store!");
            System.out.printf("You can buy only %d.", eggsRemain);
        }
    }
}
