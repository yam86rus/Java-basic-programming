package Chapter15;

import java.util.Scanner;


public class Ex15_3_TryHard {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int a = Math.abs(reader.nextInt());
        int b = Math.abs(reader.nextInt());
        while (a > 0 || b > 0) {
            System.out.println(a % 10 + b % 10);
            a = a / 10;
            b = b / 10;
        }
    }
}

//1. Постройте таблицу трассировки и укажите,·что будет выведено на экран,
//        если с клавиатуры были введены следующие значения: 99 и 698

// решай сам


//2. Постройте таблицу трассировки и укажите, что будет выведено на экран,
//        если с клавиатуры бьmи введены следующие значения: 153 и 5.

// решай сам

//3. Приведите пример вводимых с клавиатуры значений, для которых
//        цикл будет выполняться три раза, причем на экран каждый
//        раз будет выводиться одно и то же число.

// решай сам

//4. Приведите пример вводимых с клавиатуры значений, для которых
//        цикл будет выполняться три раза, причем на экран будут выводиться
//        числа 7, 8 и 9.

// 616,161, 353,535 и 545,454