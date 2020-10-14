package Chapter4;

import java.util.Scanner;

//Задание 4.17
//        Напишите программу, которая выполняет перестановку над четырехзначным
//        числом.
public class Ex4_17 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите положительное четырехзначное число");
        int a = scanner.nextInt();
        int x1, x2, x3, x4, result;
        x1 = a / 1000; // первое число
        x2 = a / 100 % 10; //второе число
        x3 = a / 10 % 10; //третье число
        x4 = a % 10;//четвертое
        result = x4 * 1000 + x3 * 100 + x2 * 10 + x1;

        System.out.println(result);
    }
}
