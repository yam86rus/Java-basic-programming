package Chapter4;

import java.util.Scanner;

//Задание 4.16
//        Назовем «перестановкой» операцию над числом, при которой его первая
//        и последняя цифры меняются местами. Например, из числа 1234
//        получается число 4231. Напишите программу, которая принимает с
//        клавиатуры трехзначное число и строит из него новое число методом
//        «перестановки».
public class Ex4_16 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите положительное трехзначное число");
        int a = scanner.nextInt();
        int x1, x2, x3, result;
        x1 = a / 100; // первое число
        x2 = a / 10 % 10; //второе число
        x3 = a % 10; //третье число
        result = x3 * 100 + x2 * 10 + x1;

        System.out.println(result);
    }
}
