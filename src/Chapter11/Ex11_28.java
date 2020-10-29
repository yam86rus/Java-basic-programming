package Chapter11;

import java.util.Scanner;

//Задание 11.28
//        Напишите класс, который принимает с клавиатуры целое положительное
//        число, а затем выводит на экран все целые положительные трехзначные
//        числа, сумма цифр которых равна введенному с клавиатуры
//        значению.
public class Ex11_28 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("start");
        for (int i = 100; i <= 999; i++) {
            if (i / 100 + i / 10 % 10 + i % 10 == a) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("finish");
    }
}
