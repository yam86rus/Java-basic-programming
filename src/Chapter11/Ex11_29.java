package Chapter11;

import java.util.Scanner;

//Задание 11.29
//        Напишите класс, который вначале принимает с клавиатуры целое положительное
//        число.
//        Затем класс выводит на экран в строку положительные трехзначные
//        числа, в которых последняя цифра такая же, как и последняя цифра в
//        значении, введенном с клавиатуры. Числа должны отделяться друг от
//        друга знаком «пробел». Перед началом и после окончания вывода серии
//        чисел на экран вывода следует вывести текстовые сообщения (по
//        выбору).
public class Ex11_29 {
    public static void main(String[] args) {
        System.out.println("Введите целое число");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("start");
        for (int i = 100; i <= 999; i++) {
            if (i % 10 == a%10) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("finish");
    }
}
