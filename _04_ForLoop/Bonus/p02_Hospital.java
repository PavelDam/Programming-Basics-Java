package L04ForLoop.Bonus;

import java.util.Scanner;

public class P02Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int period = Integer.parseInt(scanner.nextLine());

        int doctors = 7;

        int treatedPatients = 0;
        int untreatedPatient = 0;


        for (int i = 1; i <= period; i++) {
            int patients = Integer.parseInt(scanner.nextLine());

            if (i % 3 == 0 && untreatedPatient > treatedPatients) {
                doctors ++;
            }
            if (patients > doctors) {
                treatedPatients += doctors;
                untreatedPatient += (patients - doctors);
            } else {
                treatedPatients += patients;
            }
        }
        System.out.printf("Treated patients: %d.%n", treatedPatients);
        System.out.printf("Untreated patients: %d.", untreatedPatient );
    }
}
