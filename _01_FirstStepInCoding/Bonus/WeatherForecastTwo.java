package L01FirstStepInCoding.Bonus;

import java.util.Scanner;

public class WeatherForecastTwo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double gradus = Double.parseDouble(scanner.nextLine());

        if (gradus>=26.00 && gradus <=35.00) {
            System.out.printf("Hot");

        }else if (gradus>=20.1 && gradus<=25.9) {
            System.out.printf("Warm");

        }else if (gradus>=15.00 && gradus<=20.00) {
            System.out.printf("Mild");

        }else if (gradus>=12.00 && gradus<=14.9) {
            System.out.printf("Cool");

        } else if (gradus>=5.00 && gradus<=11.9) {
            System.out.printf("Cold");

        }else {
            System.out.printf("unknown");
        }
    }
}
