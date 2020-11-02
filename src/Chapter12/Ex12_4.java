package Chapter12;

import java.util.Scanner;

//Задание 12.4
//        Напишите класс, который принимает с клавиатуры 17 целых чисел и
//        выводит на экран информацию о том, сколько из них были больше,
//        чем предыдущее число.
public class Ex12_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int lastNumber = scanner.nextInt();
        for (int i = 1; i <= 17; i++) {
            int a = scanner.nextInt();
            if (a > lastNumber) count++;
            lastNumber = a;
        }
        System.out.println("чисел больше чем предыдущие число " + count);
    }
}
