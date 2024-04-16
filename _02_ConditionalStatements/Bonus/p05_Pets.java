package L02ConditionalStatements.Bonus;

import java.util.Scanner;

public class P05Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Тя има 3 домашни любимеца (куче, котка и костенурка).
        int days = Integer.parseInt(scanner.nextLine());
        int kgFood = Integer.parseInt(scanner.nextLine());
        double dogDayFood = Double.parseDouble(scanner.nextLine());
        double catDayFood = Double.parseDouble(scanner.nextLine());
        double thurtleDayFood = Double.parseDouble(scanner.nextLine()) / 1000;

        double totalKgNeeded = dogDayFood * days + catDayFood * days + thurtleDayFood * days;
        if (totalKgNeeded <= kgFood) {
            System.out.printf("%.0f kilos of food left.",Math.floor(kgFood - totalKgNeeded));
        }else {
            System.out.printf("%.0f more kilos of food are needed.",Math.ceil(totalKgNeeded - kgFood));
        }
    }
}
//•	Ако оставената храна Е достатъчна:
//o	"{килограма остатък} kilos of food left."
//	Резултатът трябва да е закръглен към по-ниското цяло число
//•	Ако оставената храна НЕ Е достатъчна:
//o	“{килограма недостигат} more kilos of food are needed.”