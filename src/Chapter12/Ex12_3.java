package Chapter12;

import java.util.Scanner;

//Задание 12.3
//        Напишите класс, который принимает с клавиатуры 12 целых чисел и
//        выводит на экран информацию о том, сколько из них были больше,
//        чем первое число.
public class Ex12_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int firstNumber = scanner.nextInt();
        for (int i = 1; i <= 11; i++) {
            int a = scanner.nextInt();
            if (a>firstNumber) count++;

        }
        System.out.println("из 12 введенных чисел, больше чем первое число " + count);
    }
}
