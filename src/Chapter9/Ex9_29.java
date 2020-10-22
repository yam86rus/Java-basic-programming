package Chapter9;

import java.util.Scanner;

//Задание 9.29
//        Напишите класс, который принимает с клавиатуры положительное
//        трехзначное число и проверяет, сколько разных цифр оно содержит.
public class Ex9_29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите положительное трехзначное число");
        int a = scanner.nextInt();
        int result = 0;
        if (a / 100 == a / 10 % 10 && a / 10 % 10 != a % 10) System.out.println(1);
        if (a / 100 != a / 10 % 10 && a / 10 % 10 == a % 10) System.out.println(1);
        if (a / 100 == a % 10 && a / 100 != a / 10 % 10) System.out.println(1);
        if (a / 100 == a / 10 % 10 && a / 10 % 10 == a % 10) System.out.println(0);

    }
}
