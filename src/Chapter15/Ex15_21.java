package Chapter15;

import java.util.Scanner;

//Задание 15.21
//        Напишите класс, который принимает с клавиатуры целое положительное
//        число.
//        Класс должен заменить его на сумму его же цифр и продолжать эту замену
//        до тех пор, пока не получится однозначное число. Все получающиеся
//        значения следует вывести на экран.
public class Ex15_21 {
    public static long summ(long a) {
        long result = 0L;
        while (a > 0) {
            result += a % 10;
            a /= 10;
        }

        return result;
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите целое положительное число");
//        int b = scanner.nextInt();
        long b = 2999999999999999999L;
        long c = summ(b);
        while (c>9){
            System.out.println(c);
            c = summ(c);
        }
        System.out.println(c);
    }
}
