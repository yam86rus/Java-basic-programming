package Chapter15;

import java.util.Scanner;

//Задание 15.20
//        Напишите класс, который вводит с клавиатуры целые положительные
//        числа до тех пор, пока не будет введено число, сумма цифр которого
//        равна 5.
public class Ex15_20 {
    static int summ(int a) {
        int result = 0;
        while (a > 0) {
            result += a % 10;
            a /= 10;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int a = scanner.nextInt();
            if (summ(a) == 5)
                break;
        }
    }
}
