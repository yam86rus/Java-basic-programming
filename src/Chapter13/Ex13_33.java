package Chapter13;

import java.util.Scanner;

//Задание 13.П
//        Для вычисления числа п используется формула Махадевы-Эйлера:
//        Напишите класс, который принимает с клавиатуры число слагаемых в
//        ряду Махадевы-Эйлера и вычисляет значение числа л.
public class Ex13_33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int a = scanner.nextInt();
        double pi = 0.00;
        for (int i = 1; i <= a; i++) {
            if (i % 2 == 1) {
                pi += 4.0 / i;
            } else {
                pi -= 4.0 / i;
            }
        }
        System.out.println(pi);
    }


}
