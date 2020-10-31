package Chapter12;

import java.util.Scanner;

//Задание 12.1
//        Напишите класс, который принимает с клавиатуры 10 целых чисел и выводит на экран информацию о том,
//        сколько из них были положительными.
public class Ex12_1 {
    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 10 целых чисел");
        for (int i = 1; i <= 4; i++) {
            int a = scanner.nextInt();
            if (a > 0) count++;
        }
        System.out.println("Положительных чисел " + count);
    }
}
