package L02ConditionalStatements.Exercises;

import java.util.Scanner;

public class P01SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     //Трима спортни състезатели финишират за някакъв брой секунди (между 1 и 50).
      //Да се напише програма, която чете времената на състезателите в секунди,
        // въведени от потребителя и пресмята сумарното им време във формат "минути:секунди".
        //Секундите да се изведат с водеща нула (2  "02", 7  "07", 35  "35").
        int timeFirst = Integer.parseInt(scanner.nextLine());
        int timeSecond = Integer.parseInt(scanner.nextLine());
        int timeThird = Integer.parseInt(scanner.nextLine());

        int totalTime = timeFirst + timeSecond + timeThird;
        int minutes = totalTime / 60;
        int seconds = totalTime % 60;

        if (seconds < 10) {
            System.out.printf("%d:0%d", minutes, seconds);

        } else {
            System.out.printf("%d:%d", minutes, seconds);
        }

    }
}
