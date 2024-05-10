package Exam9And10March2019;

import java.util.Scanner;

public class P01TennisEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tennisRaketPrice = Double.parseDouble(scanner.nextLine());
        int tennisRaketsCount = Integer.parseInt(scanner.nextLine());
        int pairsShoes = Integer.parseInt(scanner.nextLine());

        double pairShoesPrice = tennisRaketPrice /6;

        double totalPrice = tennisRaketPrice * tennisRaketsCount + pairShoesPrice * pairsShoes;
        double otherEquipment = totalPrice * 0.20;
        double finalPrice = totalPrice + otherEquipment;
        double djokovicPay = finalPrice * 0.125;
        double sponsors = finalPrice - djokovicPay;
        int dj = (int)Math.floor(djokovicPay);
        int sp = (int)Math.ceil(sponsors);

        System.out.printf("Price to be paid by Djokovic %d%n",dj);
        System.out.printf("Price to be paid by sponsors %d",sp);
    }
}
