package L01FirstStepInCoding.Bonus;

import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double h = Double.parseDouble(scanner.nextLine());
        double w = Double.parseDouble(scanner.nextLine());
        w = w * 100;
        h = h * 100;
        w = w - 100;

        int rows = (int) (h / 120);
        int desks = (int) (w /70);

        int totalSeats = (rows * desks) - 3;
        System.out.print(totalSeats);

    }
}