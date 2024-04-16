package L02ConditionalStatements.Bonus;

import java.util.Scanner;

public class P06FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //•	Магнолии – 3.25 лева
        //•	Зюмбюли – 4 лева
        //•	Рози – 3.50 лева
        //•	Кактуси – 8 лева
        //От общата сума, Мария трябва да плати 5% данъци.
        int magnolies = Integer.parseInt(scanner.nextLine());
        int ziumbules = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int cactuses = Integer.parseInt(scanner.nextLine());
        double giftPrice = Double.parseDouble(scanner.nextLine());

        double totalIncomeWithTax = (magnolies * 3.25 + ziumbules * 4 + roses * 3.50 + cactuses * 8) * 0.95;

        if (totalIncomeWithTax >= giftPrice) {
            System.out.printf("She is left with %.0f leva.", Math.floor(totalIncomeWithTax - giftPrice));
        } else {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(giftPrice - totalIncomeWithTax));
        }

    }
}
//•	Ако парите СА стигнали:
// "She is left with {останали} leva." – сумата трябва да е закръглена към по-малко цяло число (пр. 1.90 -> 1).
//•	Ако парите НЕ достигат:
// "She will have to borrow {останали} leva." – сумата трябва да е закръглена към по-голямо цяло число (пр. 1.10 -> 2).
