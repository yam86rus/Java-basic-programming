package Chapter15;

import java.util.Scanner;

//Задание 15.11
//        Напишите класс, который принимает с клавиатуры пары двузначных
//        целых чисел, пока не будет введена пара одинаковых чисел.
//        Класс должен выводить на экран сумму всех первых чисел в парах и
//        сумму всех вторых чисел в парах (не считая чисел, введенных в последней
//        паре).
public class Ex15_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        System.out.println(a+b);
        while (a != b) {
            a = scanner.nextInt();
            b = scanner.nextInt();
        }

    }
}
