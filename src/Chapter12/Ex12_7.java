package Chapter12;
//Задание 12.7
//        Напишите класс, который принимает с клавиатуры целое число х, а
//        затем - серию из 29 дополнительных целых чисел (вводимых с клавиатуры).
//        Класс должен определить, сколько чисел в серии были равны значению
//        переменной х, а сколько - были меньше значения переменной х.

import java.util.Scanner;

public class Ex12_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int a = scanner.nextInt();
        int b = 0; // счетчик равно a
        int c = 0; // счетчик меньше a
        for (int i = 1; i <= 5; i++) {
            int d = scanner.nextInt();
            if (d<a) c++;
            if (d==a) b++;
        }
        System.out.println("Равно первому числу " + b);
        System.out.println("Меньше первого числа " + c);
    }
}
