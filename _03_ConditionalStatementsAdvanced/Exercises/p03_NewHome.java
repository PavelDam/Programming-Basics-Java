package L03ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class P03NewHome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        int flowersCount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double rosesPrice = 5;
        double dahliasPrice = 3.80;
        double tulipsPrice = 2.80;
        double narcissusPrice = 3;
        double gladiolusPrice = 2.50;

        double totalSum = 0;

        //•	Ако Нели купи повече от 80 Рози - 10% отстъпка от крайната цена
        //•	Ако Нели купи повече от 90  Далии - 15% отстъпка от крайната цена
        //•	Ако Нели купи повече от 80 Лалета - 15% отстъпка от крайната цена
        //•	Ако Нели купи по-малко от 120 Нарциса - цената се оскъпява с 15%
        //•	Ако Нели Купи по-малко от 80 Гладиоли - цената се оскъпява с 20%

        if (type.equals("Roses")){
            if (flowersCount > 80){
                totalSum = (flowersCount * rosesPrice) * 0.9;

            }else {
                totalSum = flowersCount * rosesPrice;
            }
        }else if (type.equals("Dahlias")){
            if (flowersCount > 90){
                totalSum = (flowersCount * dahliasPrice) * 0.85;

            }else {
                totalSum = flowersCount * dahliasPrice;
            }
        }else if (type.equals("Tulips")){
            if (flowersCount > 80){
                totalSum = (flowersCount * tulipsPrice) * 0.85;

            }else {
                totalSum = flowersCount * tulipsPrice;
            }
        }else if (type.equals("Narcissus")){
            if (flowersCount < 120){
                totalSum = (flowersCount * narcissusPrice) * 1.15;

            }else {
                totalSum = flowersCount * narcissusPrice;
            }
        }else if (type.equals("Gladiolus")){
            if (flowersCount < 80){
                totalSum = (flowersCount * gladiolusPrice) * 1.2;

            }else {
                totalSum = flowersCount * gladiolusPrice;
            }
        }
        if (budget >= totalSum){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",flowersCount, type,(budget - totalSum));
        }else{
            System.out.printf("Not enough money, you need %.2f leva more.",totalSum - budget);
        }


    }
}
//•	Ако бюджета им е достатъчен - "Hey, you have a great garden with {броя цвета} {вид цветя} and {останалата сума} leva left."
//•	Ако бюджета им е НЕ достатъчен - "Not enough money, you need {нужната сума} leva more."
//Сумата да бъде форматирана до втория знак след десетичната запетая.