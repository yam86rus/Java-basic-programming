package Chapter4;

import java.util.Scanner;

//Задание 4.15
//        Напишите класс, который принимает с клавиатуры положительное
//        четырехзначное число, а затем вычисляет и выводит на экран его «степень
//        четности».
public class Ex4_15 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите положительное трехзнчное число");
        int a = scanner.nextInt();
        int x1, x2, x3, x4, result = 0;
        x1 = a / 1000; // первое число
        x2 = a / 100 % 10; //второе число
        x3 = a / 10 % 10; // третье число
        x4 = a % 10; // четвертое число

        if (x1 % 2 == 0) result++;
        if (x2 % 2 == 0) result++;
        if (x3 % 2 == 0) result++;
        if (x4 % 2 == 0) result++;

        System.out.println(result);
    }
}
