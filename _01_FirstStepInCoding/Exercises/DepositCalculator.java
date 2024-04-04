package L01FirstStepInCoding.Exercises;

import java.util.Scanner;

public class DepositCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double deposit = Double.parseDouble(scanner.nextLine());
        int month = Integer.parseInt(scanner.nextLine());
        double ir = Double.parseDouble(scanner.nextLine())/100;
        double rate = deposit * ir;
        double monthRate = rate/12;

        double sum = deposit + month * monthRate;

        System.out.println(sum);
    }
}
