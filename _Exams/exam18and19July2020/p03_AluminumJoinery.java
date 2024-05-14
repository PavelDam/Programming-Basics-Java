package Exam18and19July2020;

import java.util.Scanner;

public class P03AluminumJoinery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int joineryCount = Integer.parseInt(scanner.nextLine());
        String joineryType = scanner.nextLine();
        String deliveryType = scanner.nextLine();

        int deliveryPrice = 60;

        double joineryPrice = 0;

        if (joineryCount < 10) {
            System.out.println("Invalid order");
            return;
        }

        switch (joineryType) {
            case "90X130":
                joineryPrice = 110;
                if (joineryCount > 30 && joineryCount <= 60) {
                    joineryPrice = joineryPrice * 0.95;
                } else if (joineryCount > 60) {
                    joineryPrice = joineryPrice * 0.92;
                }
                break;
            case "100X150":
                joineryPrice = 140;
                if (joineryCount > 40 && joineryCount <= 80) {
                    joineryPrice = joineryPrice * 0.94;
                } else if (joineryCount > 80) {
                    joineryPrice = joineryPrice * 0.90;
                }
                break;
            case "130X180":
                joineryPrice = 190;
                if (joineryCount > 20 && joineryCount <= 50) {
                    joineryPrice = joineryPrice * 0.93;
                } else if (joineryCount > 50) {
                    joineryPrice = joineryPrice * 0.88;
                }
                break;
            case "200X300":
                joineryPrice = 250;
                if (joineryCount > 25 && joineryCount <= 50) {
                    joineryPrice = joineryPrice * 0.91;
                } else if (joineryCount > 50) {
                    joineryPrice = joineryPrice * 0.86;
                }
                break;
        }
        double totalPrice = joineryPrice * joineryCount;

        if (deliveryType.equals("With delivery")) {
            totalPrice += 60;
        }
        if (joineryCount > 99) {
            totalPrice = totalPrice * 0.96;
        }
        System.out.printf("%.2f BGN", totalPrice);
    }
}
