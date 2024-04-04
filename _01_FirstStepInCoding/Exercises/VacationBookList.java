package L01FirstStepInCoding.Exercises;

import java.util.Scanner;

public class VacationBookList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //212,20,2
        int pagesCount = Integer.parseInt(scanner.nextLine());
        int pagesPerHours = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int totalTime = pagesCount / pagesPerHours;
        int neededHours = totalTime / days;

        System.out.println(neededHours);

    }
}
