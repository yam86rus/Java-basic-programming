package Chapter12;

import java.util.Scanner;

//Задание 12.3
//        Напишите класс, который принимает с клавиатуры 12 целых чисел и
//        выводит на экран информацию о том, сколько из них были больше,
//        чем первое число.
public class Ex12_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 12  целых чисел");
        int a = scanner.nextInt();
        int counter = 0;
        for (int i = 1; i <= 12; i++) {
            int b = scanner.nextInt();
            if (b > a) counter++;
        }
        System.out.println("Больше чем первое число" + counter);
    }
}
