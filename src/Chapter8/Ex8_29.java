package Chapter8;

import java.util.Scanner;

//Задание 8.29
//        Напишите класс, который принимает с клавиатуры две пары целых
//        ненулевых чисел: первая пара является числителем и знаменателем одной
//        дроби, вторая пара - числителем и знаменателем другой дроби.
//        Класс должен проверить, равны ли эти дроби друг другу, и вывести на
//        экран соответствующее текстовое сообщение.
public class Ex8_29 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите 4 числа");
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt(), d = scanner.nextInt();
        String result = a * d == c * b ? "Дроби равны" : "Дроби не равны";
        System.out.println(result);
    }
}
