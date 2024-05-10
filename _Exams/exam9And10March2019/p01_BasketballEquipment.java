package Exam9And10March2019;

import java.util.Scanner;

public class P01BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yearTax = Integer.parseInt(scanner.nextLine());

        double shoesPrice = yearTax * 0.60;
        double clothPrice = shoesPrice * 0.80;
        double ballPrice = clothPrice * 0.25;
        double acessoariesPrice = ballPrice * 0.2;

        double totalPrice = yearTax + shoesPrice + clothPrice + ballPrice + acessoariesPrice;
        System.out.printf("%.2f", totalPrice);
    }
}
