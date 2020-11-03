package Chapter13;

import java.util.Scanner;

//Задание 13.32
//        Для вычисления числа п используется формула Эйлера: p2 / 6 равно
//        сумме ряда Напишите класс, который принимает с клавиатуры число слагаемых в
//        ряду Эйлера и вычисляет значение числа л.
public class Ex13_32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число слагаемый в ряду Эйлера");
        int a = scanner.nextInt();
        double pi = 0.00;
        for (int i = 1; i <= a; i++) {
            pi += 1.00 / Math.pow(i,2);
        }
        System.out.println(pi);
    }

}
