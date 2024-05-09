package Exam6And7July2019;

import java.util.Scanner;

public class P04Renovation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wallHight = Integer.parseInt(scanner.nextLine());
        int wallWidth = Integer.parseInt(scanner.nextLine());
        int percentNonPaint = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int totalArea = wallHight * wallWidth * 4;
        double areaForPainting = Math.ceil(totalArea - (1.0 * totalArea * percentNonPaint / 100));

        int totalLiters = 0;

        while (!input.equals("Tired!")) {
            int litersPaint = Integer.parseInt(input);
            totalLiters += litersPaint;

            if (totalLiters >= areaForPainting) {
                break;
            }

            input = scanner.nextLine();
        }
        if (input.equals("Tired!")) {
            System.out.printf("%d quadratic m left.", (int) areaForPainting - totalLiters);
        }
        if (totalLiters > areaForPainting) {
            System.out.printf("All walls are painted and you have %d l paint left!", totalLiters - (int) areaForPainting);
        } else if (totalLiters == areaForPainting) {
            System.out.printf("All walls are painted! Great job, Pesho!");
        }
    }
}
