package Chapter6;

//Задание 6.6
//Напишите класс, который принимает с клавиатуры целое число и выводит
//        на экран одно из следующих сообщений: Положительное, или
//        Отрицательное, или Ноль, - в зависимости от значения числа.

import java.util.Scanner;

public class Ex6_6 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите любое число");
        double number = reader.nextDouble();
        if (number < 0) System.out.println("Отрицательное");
        if (number > 0) System.out.println("Положительное");
        if (number == 0) System.out.println("Ноль");

    }
}
