package Exam2And3May2019;

import java.util.Scanner;

public class P01FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double strawPrice = Double.parseDouble(scanner.nextLine());
        double bananaCount = Double.parseDouble(scanner.nextLine());
        double orangeCount = Double.parseDouble(scanner.nextLine());
        double berryCount = Double.parseDouble(scanner.nextLine());
        double strawCount = Double.parseDouble(scanner.nextLine());

        double berryPrice = strawPrice / 2;
        double orangePrice = berryPrice * 0.6;
        double bananaPrice = berryPrice * 0.2;

        double moneyNeeded = strawPrice*strawCount +bananaPrice*bananaCount + orangePrice*orangeCount + berryPrice*berryCount;

        System.out.printf("%.2f",moneyNeeded);
    }
}
