package Chapter13;

import java.util.Scanner;

//Задание 13.18
//        По правилам банка, на вклад ежемесячно начисляется определенная
//        сумма, которая зависит от ежемесячного процента на вклад.
//        Например, на вкладе в 10000 рублей с месячным процентом 10% через
//        месяц будет сумма 11000 рублей (1000 плюс 10% от 1000), а еще через
//        месяц - 12100 (11000 плюс 10% от 11000).
//        Напишите класс, который принимает с клавиатуры три значения:
//        • сумму на вкладе;
//        • месячный процент;
//        • количество месяцев, в течение которых начисляются проценты на
//        вклад.
//        Класс подсчитает и выведет на экран итоговую сумму на вкладе.
public class Ex13_18 {
    static double showInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму вклада");
        double deposit = scanner.nextInt();
        System.out.println("Введите месячный процент");
        double percentPerMont = scanner.nextInt();
        System.out.println("Введите количество месяцев");
        int monthNumber = scanner.nextInt();
        for (int i = 1; i <= monthNumber; i++) {
            deposit += deposit * percentPerMont / 100;
        }
        return deposit;
    }

    public static void main(String[] args) {
        System.out.println(showInfo());
    }
}
