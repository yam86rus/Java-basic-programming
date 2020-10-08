package Chapter2;

import java.util.Scanner;

//Задание 2.23
//        Напишите класс, который принимает с клавиатуры два целых числа и
//        выводит на экран следующие значения (каждое в отдельной строке):
//        квадрат каждого числа (отдельно) и сумму квадратов введенных чисел.
public class Ex2_23 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int a = reader.nextInt();
        int b = reader.nextInt();
        int c = a * a + b * b;

        System.out.println("Квадрат числа " + a + " равен: " + (a * a));
        System.out.println("Квадрат числа " + b + " равен: " + (b * b));
        System.out.println("Сумма квадратов двух числел равна: " + c);
    }
}
