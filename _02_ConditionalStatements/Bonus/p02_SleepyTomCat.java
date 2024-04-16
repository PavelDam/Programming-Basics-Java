package L02ConditionalStatements.Bonus;

import java.util.Scanner;

public class P02SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int holidays = Integer.parseInt(scanner.nextLine());

        //За да се наспи добре, нормата за игра на Том е 30 000  минути в година.
        // Времето за игра на Том зависи от почивните дни на стопанина му:
        //•	Когато е на работа, стопанинът му си играе с него по 63 минути на ден.
        //•	Когато почива, стопанинът му си играе с него  по 127 минути на ден.
        //Напишете програма, която въвежда броя почивни дни и отпечатва дали Том може да се наспи добре и колко е разликата
        // от нормата за текущата година, като приемем че годината има 365 дни.
        //Пример: 20 почивни дни -> работните дни са 345 (365 – 20 = 345). Реалното време за игра е 24 275 минути (345 * 63 + 20 *127).
        // Разликата от нормата е 5 725 минути (30 000 – 24 275 = 5 725) или 95 часа и 25 минути.
        int sleepWellMinutes = 30000;
        int workdayMinutes = 63;
        int holidayMinutes = 127;
        int alldays = 365;
        int workdays = alldays - holidays;
        double totalMinutes = holidays * holidayMinutes + workdays * workdayMinutes;

        if (totalMinutes >= sleepWellMinutes) {
            double difference = (totalMinutes - sleepWellMinutes);
            double hours = Math.floor(difference / 60);
            double minutes = difference % 60;
            System.out.println("Tom will run away");
            System.out.printf("%.0f hours and %.0f minutes more for play", hours, minutes);
        } else {
            double difference = (sleepWellMinutes - totalMinutes);
            double hours = Math.floor(difference / 60);
            double minutes = difference % 60;
            System.out.println("Tom sleeps well");
            System.out.printf("%.0f hours and %.0f minutes less for play", hours, minutes);
        }


    }
}
//•	Ако времето за игра на Том е над нормата за текущата година:
//o	 На първия ред отпечатайте: “Tom will run away”
//o	 На втория ред отпечатайте разликата от нормата във формат:
//“{H} hours and {M} minutes more for play”
//•	Ако времето за игра на Том е под нормата за текущата година:
//o	На първия ред отпечатайте: “Tom sleeps well”
//o	 На втория ред отпечатайте разликата от нормата във формат:
//“{H} hours and {M} minutes less for play”
