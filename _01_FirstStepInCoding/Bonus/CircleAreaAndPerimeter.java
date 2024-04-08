package L01FirstStepInCoding.Bonus;

import java.util.Scanner;

public class CircleAreaAndPerimeter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double r = Double.parseDouble(scanner.nextLine());

        double areaCircle = Math.PI * r * r;
        double parameterCircle = 2 * r * Math.PI;

        System.out.printf("%.2f%n%.2f",areaCircle,parameterCircle);
    }
}
