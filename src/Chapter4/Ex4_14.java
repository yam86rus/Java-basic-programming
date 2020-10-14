package Chapter4;

import java.util.Scanner;

//Задание 4.14
//        Напишите класс, который принимает с клавиатуры положительное
//        трехзначное число, а затем вычисляет и выводит на экран его «степень
//        четности».
public class Ex4_14 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите положительное трехзнчное число");
        int a = scanner.nextInt();
        int x1, x2, x3, result = 0;
        x1 = a / 100; // первое число
        x2 = a / 10 % 10; //второе число
        x3 = a % 10; // третье число

        if (x1 % 2 == 0) result++;
        if (x2 % 2 == 0) result++;
        if (x3 % 2 == 0) result++;

        System.out.println(result);
    }
}
