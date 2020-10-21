package Chapter9;

import java.util.Scanner;

//Задание 9.10
//        Напишите класс, который принимает с клавиатуры три целых числа и
//        определяет, в каких соотношениях с точки зрения значений (равны,
//        больше, меньше) они находятся. На экран следует вывести сообщение с
//        точным указанием результатов проверки: например, Первое и третье
//        равны, второе больше них или Все значения одинаковы.
public class Ex9_10 {

    public static void main(String[] args) {
        showInfo();
    }

    private static void showInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        System.out.println("Введите третье число");
        int с = scanner.nextInt();
        if (a < b) System.out.println("Первое число меньше второго");
        if (a == b) System.out.println("Первое и второе число равны");
        if (a > b) System.out.println("Первое число больше второго");

        if (a < с) System.out.println("Первое число меньше третьего");
        if (a == с) System.out.println("Первое и третье число равны");
        if (a > с) System.out.println("Первое число больше третьего");

        if (b < с) System.out.println("Второе число меньше третьего");
        if (b == с) System.out.println("Второе и третье число равны");
        if (b > с) System.out.println("Второе число больше третьего");
    }
}
