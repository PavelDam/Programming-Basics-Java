package L03ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class P08OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hourOnExam = Integer.parseInt(scanner.nextLine());
        int minuteOnExam = Integer.parseInt(scanner.nextLine());
        int arrivingHour = Integer.parseInt(scanner.nextLine());
        int arrivingMinute = Integer.parseInt(scanner.nextLine());

        int timeExam = hourOnExam * 60 + minuteOnExam;
        int timeArive = arrivingHour * 60 + arrivingMinute;

        if (timeExam < timeArive) {
            System.out.println("Late");
            double diff = timeArive - timeExam;
            double h = Math.floor(diff / 60);
            double m = diff % 60;
            if (diff >= 60) {
                if (m < 10) {
                    System.out.printf("%.0f:0%.0f hours after the start", h, m);
                } else {
                    System.out.printf("%.0f:%.0f hours after the start", h, m);
                }
            } else {
                System.out.printf("%.0f minutes after the start", m);
            }
        } else if (timeExam >= timeArive && timeExam - timeArive <= 30) {
            System.out.println("On time");
            double diff = timeExam - timeArive;
            if (diff != 0) {
                double m = diff % 60;
                System.out.printf("%.0f minutes before the start", m);
            }
        } else {
            System.out.println("Early");
            double diff = timeExam - timeArive;
            double h = Math.floor(diff / 60);
            double m = diff % 60;
            if (diff >= 60) {
                if (m < 10) {
                    System.out.printf("%.0f:0%.0f hours before the start", h, m);
                } else {
                    System.out.printf("%.0f:%.0f hours before the start", h, m);
                }
            }else {
                System.out.printf("%.0f minutes before the start",m);
            }
        }
    }
}
//import java.util.Scanner;
//
//public class Demo {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int hour = Integer.parseInt(scanner.nextLine());
//        int min = Integer.parseInt(scanner.nextLine());
//        int hourA = Integer.parseInt(scanner.nextLine());
//        int minA = Integer.parseInt(scanner.nextLine());
//
//        int totalMin = hour * 60 + min;
//        int totalminA = hourA * 60 + minA;
//        int diff = totalMin - totalminA;
//
//        if (diff == 0) {
//            System.out.println("On time");
//        } else if (diff > 0 && diff <= 30) {
//            System.out.printf("On time%n%d minutes before the start", Math.abs(diff));
//        } else if (diff < 0) {
//            diff = Math.abs(diff);
//            System.out.println("Late");
//            if (diff >= 60) {
//                hour = diff / 60;
//                min = diff % 60;
//                System.out.printf("%d:%02d hours after the start", hour, min);
//            } else {
//                System.out.printf("%d minutes after the start",diff);
//            }
//        } else {
//            System.out.println("Early");
//            if (diff >= 60) {
//                hour = diff / 60;
//                min = diff % 60;
//                System.out.printf("%d:%02d hours before the start", hour, min);
//            } else {
//                System.out.printf("%d minutes before the start",diff);
//            }
//
//        }
//    }
//}