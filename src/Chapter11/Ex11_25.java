package Chapter11;

import java.util.Scanner;

//Задание 11.2 S
//        Напишите класс, который вначале принимает с клавиатуры целое положительное
//        число (в переменную х). Затем класс выводит на экран в
//        строку все целые числа из диапазона O ... |x| (включая крайние значения
//        диапазона). Числа должны отделяться друг от друга знаком «пробел».
//        Перед началом и после окончания вывода серии чисел на экран вывода
//        следует вывести текстовые сообщения (по выбору).
public class Ex11_25 {
    public static void main(String[] args) {
        System.out.println("Введите целое число");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Начало");
        for (int i = 0; i <= Math.abs(a); i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Конец");

    }
}
