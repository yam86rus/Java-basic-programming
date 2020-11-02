package Chapter13;

import java.util.Scanner;

//Задание 13.7
//        Назовем «дважды четным» целое положительное число, если и оно само,
//        и сумма его делителей - четные числа.
//        Напишите класс, который принимает с клавиатуры целое положительное
//        число и проверяет, является ли оно «дважды четным».
public class Ex13_7 {
    static boolean check() {
        boolean result = false;
        System.out.println("Введите целое положительное число");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int summa = 0;
        if (a % 2 != 0) {
            return false;
        }
        for (int i = a; i >= 1; i--) {
            if (a % i == 0) {
                summa += i;
            }
        }
        if (summa % 2 == 0) {
            result = true;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(check());
    }
}
