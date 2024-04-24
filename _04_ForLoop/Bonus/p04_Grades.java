package L04ForLoop.Bonus;

import java.util.Scanner;

public class P04Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentsCount = Integer.parseInt(scanner.nextLine());

        int above5 = 0;
        int btw4And5 = 0;
        int btw3And4 = 0;
        int btw2And3 = 0;
        double averageGrade = 0;
        for (int i = 1; i <= studentsCount; i++) {
            double studentGrade = Double.parseDouble(scanner.nextLine());
            if (studentGrade >= 2.00 && studentGrade <= 2.99) {
                averageGrade += studentGrade;
                btw2And3 += 1;
            } else if (studentGrade >= 3.00 && studentGrade <= 3.99) {
                averageGrade += studentGrade;
                btw3And4 += 1;
            } else if (studentGrade >= 4.00 && studentGrade <= 4.99) {
                averageGrade += studentGrade;
                btw4And5 += 1;
            } else if (studentGrade >= 5.00) {
                averageGrade += studentGrade;
                above5 += 1;
            }
        }
        double average = averageGrade / studentsCount;
        double pAbove5 = 1.0 * above5 / studentsCount * 100;
        double pbtw4And5 = 1.0 * btw4And5 / studentsCount * 100;
        double pbtw3And4 = 1.0 * btw3And4 / studentsCount * 100;
        double pbtw2And3 = 1.0 * btw2And3 / studentsCount * 100;

        System.out.printf("Top students: %.2f%%%n", pAbove5);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", pbtw4And5);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", pbtw3And4);
        System.out.printf("Fail: %.2f%%%n", pbtw2And3);
        System.out.printf("Average: %.2f", average);
    }
}
