package Exam6And7April2019;

import java.util.Scanner;

public class P01OscarCeremony {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hallRent = Integer.parseInt(scanner.nextLine());
        double oscars = hallRent * 0.7;
        double food = oscars * 0.85;
        double sound = food / 2;

        double totalSum = hallRent + oscars + food + sound;
        System.out.printf("%.2f", totalSum);

    }
}
