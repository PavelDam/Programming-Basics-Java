package L05WhileLoop.Exercise;

import java.util.Scanner;

public class P0ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int badGradeThreshold = Integer.parseInt(scanner.nextLine());
        String name = scanner.nextLine();

        int badGradeCount = 0;
        int sumGrade = 0;
        String lastProblem = "";
        int problemsCount = 0;

        while (!name.equals("Enough")) {
            int grade = Integer.parseInt(scanner.nextLine());
            problemsCount++;
            if (grade <= 4) {
                badGradeCount++;
            }
            if (badGradeThreshold == badGradeCount) {
                break;
            }

            sumGrade = sumGrade + grade;
            lastProblem = name;
            name = scanner.nextLine();
        }
        double averageGrade = 1.0 * sumGrade / problemsCount;
        if (badGradeThreshold == badGradeCount) {
            System.out.printf("You need a break, %d poor grades.", badGradeCount);
        } else {
            System.out.printf("Average score: %.2f%n", averageGrade);
            System.out.printf("Number of problems: %d%n", problemsCount);
            System.out.printf("Last problem: %s", lastProblem);
        }

    }
}
