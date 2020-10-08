package Chapter2;

import java.util.Scanner;

//Задание 2.22
//        Напишите класс, который принимает с клавиатуры два целых числа и
//        выводит на экран следующие значения (каждое в отдельной строке):
//        сумму введенных чисел, их произведение, разницу между первым и
//        вторым, разницу между вторым и первым.
public class Ex2_22 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int a = reader.nextInt();
        int b = reader.nextInt();
        System.out.println("Сумма: " + (a + b));
        System.out.println("Произведение: " + (a * b));
        System.out.println("Разница между первым и вторым: " + (a - b));
        System.out.println("Разница между вторым и первым: " + (b - a));
    }
}
