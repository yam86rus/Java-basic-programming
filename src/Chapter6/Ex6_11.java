package Chapter6;

import java.util.Scanner;

//Задание 6.11
//        Напишите класс, который принимает с клавиатуры два целых числа и,
//        если оба имеют одинаковый знак, на экран выводится сообщение
//        Один и тот же знак, а если разный, то на экран выводится сообщение
//        Разные знаки. Если же хотя бы одно из чисел равно О, выводится сообщение
//        Некорректно.
public class Ex6_11 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите целое число");
        int a = reader.nextInt();
        System.out.println("Введите целое число");
        int b = reader.nextInt();
        if (a == 0 || b == 0) {
            System.out.println("Некорректно");
        } else if (a > 0 && b > 0) {
            System.out.println("Один и тот же знак");
        } else if (a < 0 && b < 0) {
            System.out.println("Один и тот же знак");
        } else {
            System.out.println("Разные знаки");
        }

    }
}
