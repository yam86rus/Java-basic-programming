package Chapter12;

import java.util.Scanner;

//Задание 12.7
//        Напишите класс, который принимает с клавиатуры целое число х, а
//        затем - серию из 29 дополнительных целых чисел (вводимых с клавиатуры).
//        Класс должен определить, сколько чисел в серии были равны значению
//        переменной х, а сколько - были меньше значения переменной х.
public class Ex12_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int a = scanner.nextInt();
        int b = 0, c = 0; // равно, меьше
        for (int i = 1; i <= 5; i++) {
            int d = scanner.nextInt();
            if (d==a) b++;
            if (d<a) c++;
        }
        System.out.println("равны " + b);
        System.out.println("меньше " + c);
    }
}
