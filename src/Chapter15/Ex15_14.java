package Chapter15;

import java.util.Scanner;

//Задание 15.14
//        Напишите класс, который принимает с клавиатуры целое положительное
//        число и выводит на экран количество его цифр и их сумму.
public class Ex15_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scanner.nextInt();
        int count = 1;
        int summ = a % 10;
        while (true) {
            if (a / 10 == 0) break;
            count++;
            a /= 10;
            summ += a % 10;
        }
        System.out.println("Цифр в числе " + count);
        System.out.println("Сумма цифр в числе " + summ);

    }
}
