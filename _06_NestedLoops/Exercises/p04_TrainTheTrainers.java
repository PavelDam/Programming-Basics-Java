package L06NestedLoops.Exercises;

import java.util.Scanner;

public class P04TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juriCount = Integer.parseInt(scanner.nextLine());

        String name = scanner.nextLine();
        double gradeAverage = 0;
        int gradeCount = 0;
        while (!name.equals("Finish")) {

            double averageGrade = 0;
            for (int i = 1; i <= juriCount; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                averageGrade += grade;
                gradeAverage += grade;
                gradeCount++;
            }
            System.out.printf("%s - %.2f.%n", name, (averageGrade / juriCount));
            name = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", (gradeAverage / gradeCount));
    }
}
