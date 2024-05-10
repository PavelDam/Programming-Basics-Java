package Exam9And10March2019;

import java.util.Scanner;

public class P02Skeleton {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minutes = Integer.parseInt(scanner.nextLine());
        int seconds = Integer.parseInt(scanner.nextLine());
        double lenght = Double.parseDouble(scanner.nextLine());
        int sec100m = Integer.parseInt(scanner.nextLine());

        int totalSec = minutes * 60 + seconds;
        double delay = lenght / 120;
        double totalDelay = delay * 2.5;
        double totalTime = (lenght / 100) * sec100m - totalDelay;
        if (totalTime <= totalSec) {
            System.out.println("Marin Bangiev won an Olympic quota!");
            System.out.printf("His time is %.3f.", totalTime);
        } else {
            System.out.printf("No, Marin failed! He was %.3f second slower.", totalTime - totalSec);
        }
    }
}
