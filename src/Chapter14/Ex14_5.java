package Chapter14;

import java.util.Scanner;

//Задание 14.5
//        Напишите класс, который принимает с клавиатуры серию из 12 целых
//        чисел и определяет среднее арифметическое максимума и минимума
//        для этой серии.
public class Ex14_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scanner.nextInt();
        int max = a, min = a;
        double avr = a;

        for (int i = 2; i <= 5; i++) {
            int b = scanner.nextInt();
            if (b>max) max = b;
            if (b<min) min = b;
            avr += b;
        }
        System.out.println("Максимальное число " + max);
        System.out.println("Минимальное число " + min);
        System.out.println("Среднее арифметическое " + avr/5);
        scanner.close();

    }
}
