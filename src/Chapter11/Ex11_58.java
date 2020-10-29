package Chapter11;

import java.util.Scanner;

//Задание 11.58
//        Напишите класс, который принимает с клавиатуры целое число N,
//        а затем принимает с клавиатуры N целых чисел.
//        Для каждого вводимого с клавиатуры неотрицательного числа следует
//        вывести на экран его квадрат, а для остальных чисел - текст Пропускаем.
public class Ex11_58 {
    public static void main(String[] args) {
        System.out.println("Сколько будет введено цифр?");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = 1; i <= a; i++) {
            int b = scanner.nextInt();
            if (b >= 0) {
                System.out.println("Квадрат числа: " + b + " = " + b * b);
            } else {
                System.out.println("Пропускаем число: " + b);
            }
        }
    }
}
