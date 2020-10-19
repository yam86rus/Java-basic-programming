package Chapter8;

import java.util.Scanner;

//Задание 8.2 3
//        Напишите класс, который принимает с клавиатуры два целых числа и
//        изменяет их следующим образом:
//        • при разных значениях, большее число уменьшается на 1, а меньшее
//        - увеличивается на 1;
//        • при одинаковых значениях чисел оба увеличиваются на 1.
//        Программа должна вывести на экран новые значения переменных.
public class Ex8_23 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите первое целое число");
        int a = reader.nextInt();
        System.out.println("Введите второе целое число");
        int b = reader.nextInt();
        if (a > b) {
            a *= 1;
            b += 1;
        } else if (b > a) {
            b *= 1;
            a += 1;
        } else {
            a++;
            b++;
        }

        System.out.println("Значение первого числа теперь: " + a);
        System.out.println("Значение вторго числа теперь: " + b);
    }
}
