package L02ConditionalStatements.Exercises;

import java.util.Scanner;

public class P06WorldSwimmingRecord {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double recordInSeconds = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double secondsForOneMeter = Double.parseDouble(scanner.nextLine());
        //: съпротивлението на водата го забавя на всеки 15 м. с 12.5 секунди.
        //Когато се изчислява колко пъти Иван ще се забави, в резултат на съпротивлението на водата,
        // резултатът трябва да се закръгли надолу до най-близкото цяло число.
        double totalTimeForDistance = distance * secondsForOneMeter;
        double delay = Math.floor(distance / 15) * 12.5;
        double totalTime = totalTimeForDistance + delay;

        if (totalTime < recordInSeconds) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",totalTime);

        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.",totalTime - recordInSeconds);
        }
    }
}
//•	Ако Иван е подобрил Световния рекорд (времето му е по-малко от рекорда) отпечатваме:
//o	"Yes, he succeeded! The new world record is {времето на Иван} seconds."
//•	Ако НЕ е подобрил рекорда (времето му е по-голямо или равно на рекорда) отпечатваме:
//o	"No, he failed! He was {недостигащите секунди} seconds slower."
//Резултатът трябва да се форматира до втория знак след десетичната запетая.