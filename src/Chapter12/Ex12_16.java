package Chapter12;

import java.util.Scanner;

//Задание 12.16
//        Напишите класс, который принимает с клавиатуры целое положительное число и определяет,
//        является ли оно простым.
public class Ex12_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) count++;
        }
        if (a == 1) {
            System.out.println("Число 1 не является ни простым ни составным");
        } else if (count == 2) {
            System.out.println("Число простое");
        } else if (count > 2) {
            System.out.println("Число составное");
        }

    }
}
