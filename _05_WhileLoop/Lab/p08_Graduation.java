package L05WhileLoop.Lab;

import java.util.Scanner;

public class P08Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        int years = 1;
        int badGrade = 0;
        double sumGrade = 0;

        while (years <= 12) {

            if (badGrade > 1) {
                break;
            }
            double grade = Double.parseDouble(scanner.nextLine());

            if (grade < 4) {
                badGrade++;
                continue;
            }
            sumGrade = sumGrade + grade;
            years++;
        }
        if (badGrade > 1) {
            System.out.printf("%s has been excluded at %d grade", name, years);
        } else {
            double averageGrade = sumGrade / 12;
            System.out.printf("%s graduated. Average grade: %.2f", name, averageGrade);
        }

    }
}
