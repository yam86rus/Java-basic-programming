package Chapter11;

import java.util.Scanner;

//Задание 11.21
//        Напишите класс, который вначале принимает с клавиатуры целое положительное
//        число (в переменную х). Затем класс выводит на экран в
//        строку серию из 17 целых положительных чисел, отвечающую следующим
//        условиям:
//        1) серия начинается с числа, большего хна 1;
//        2) каждое число в серии (начиная со второго) больше предьщущего на 1.
//        Числа должны отделяться друг от друга знаком «пробел». Перед началом
//        и после окончания вывода серии чисел на экран вывода следует
//        вывести текстовые сообщения (по выбору).
public class Ex11_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int x = scanner.nextInt();
        System.out.println("Старт");
        for (int i = x + 1; i <= x + 18; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Финиш");
    }
}