package Chapter12;

import java.util.Scanner;

//Задание 12.1
//        Напишите класс, который принимает с клавиатуры 10 целых чисел и выводит
//        на экран информацию о том, сколько из них бьmи положительными.
public class Ex12_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Введите целое число");
            int a = scanner.nextInt();
            if (a > 0) result++;
        }
        System.out.println("Всего положительный чисел " + result);
    }
}
