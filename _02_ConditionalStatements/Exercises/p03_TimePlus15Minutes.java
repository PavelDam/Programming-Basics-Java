package L02ConditionalStatements.Exercises;

import java.util.Scanner;

public class P03TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine()) + 15;

        if (minutes > 59) {
            hour = hour + 1;
            minutes = minutes - 60;
        }
        if (hour > 23) {
            hour = hour - 24;

        }
        if (minutes < 10) {
            System.out.printf("%d:0%d", hour, minutes);
        } else {
            System.out.printf("%d:%d", hour, minutes);
        }


    }
}
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//
//        int hour = Integer.parseInt(scanner.nextLine());
//        int min = Integer.parseInt(scanner.nextLine());
//
//        int totalMin = hour * 60 + min + 15; // превръщаме часовете в минути, прибавяме минутите и отделно още 15мин.
//
//        hour = totalMin / 60; // от всички минути намираме часовете с целочислено деление
//        min = totalMin % 60; // от всички минути намираме останалите минути
//
//        if (hour > 23) { // ако часът е по-голям от 23, става равен на 0
//            hour = 0;
//        }
//
//        System.out.printf("%d:%02d", hour, min); // Печатането на резултата с водеща нула може да се осъществи и чрез шаблона %02d,
//        // чрез който можем да покажем, че искаме нашето число да се състои от две цифри
//
//        /* if (min < 10) {
//            System.out.printf("%d:0%d", hour, min);
//        } else {
//            System.out.printf("%d:%d", hour, min);
//        } */
//    }
//}
