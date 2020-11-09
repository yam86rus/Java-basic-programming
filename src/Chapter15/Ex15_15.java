package Chapter15;

import java.util.Scanner;

//Задание 15.15
//        Напишите класс, который принимает с клавиатуры целое число и выводит
//        на экран количество четных цифр в нем и их сумму.
public class Ex15_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scanner.nextInt();
        int count = 0; // счетчик четных цифр
        int summ = 0; // сумма четных цифр
        while (true) {
            if (a % 2 == 0) {
                count++;
                summ += a % 10;
            }
            if (a / 10 == 0) break;
            a /= 10;
        }
        System.out.println("Количество четных чисел " + count);
        System.out.println("Сумма четных чисел в числе " + summ);

    }
}

