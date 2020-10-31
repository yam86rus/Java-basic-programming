package Chapter12;

import java.util.Scanner;

//Задание 12.2
//        Напишите класс, который принимает с клавиатуры 15 целых чисел и
//        выводит на экран информацию о том, сколько из них были четными и
//        сколько нечетными.
public class Ex12_2 {
    public static void main(String[] args) {
        int a = 0, b = 0;//
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 15 целых чисел");
        for (int i = 1; i <= 5; i++) {
            int c = scanner.nextInt();
            if (c % 2 == 0) {
                a++;
            } else {
                b++;
            }
        }
        System.out.println("Четных " + a);
        System.out.println("Нечетных " + b);
    }

}
